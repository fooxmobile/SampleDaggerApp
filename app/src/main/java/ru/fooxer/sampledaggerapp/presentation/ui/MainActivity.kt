package ru.fooxer.sampledaggerapp.presentation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.fooxer.sampledaggerapp.R
import ru.fooxer.sampledaggerapp.domain.model.User
import ru.fooxer.sampledaggerapp.presentation.adapter.UsersRecyclerAdapter
import ru.fooxer.sampledaggerapp.presentation.di.App
import ru.fooxer.sampledaggerapp.presentation.presenters.MainPresenter
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {

    val TAG_USER_ID = "USER_ID"

    lateinit var rv: RecyclerView
    val onItemClick: (Int) -> Unit = ::getId
    var adapter = UsersRecyclerAdapter(onItemClick)
    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as App).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.setView(this)
    }

    override fun onStart() {
        super.onStart()
        initView()
        presenter.onViewCreated()
    }

    override fun setContent(content: ArrayList<User>) {
        adapter.update(content)
    }

    override fun navigateToDetails(id: Int) {
        Log.d("MAINACTIVITY","I am here and id: $id")
        val intent = Intent(this, SecondActivity::class.java).apply {
            putExtra(TAG_USER_ID, id)
        }
        startActivity(intent)
    }

    fun initView() {
        rv = findViewById(R.id.rv_users)
        rv.layoutManager = LinearLayoutManager(this)
        rv.adapter = adapter
    }

    fun getId(id: Int) {
        presenter.onItemClick(id)
        Log.d("MAINACTIVITY", "Current id:$id")
    }

}