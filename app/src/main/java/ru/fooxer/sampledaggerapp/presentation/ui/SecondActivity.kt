package ru.fooxer.sampledaggerapp.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import ru.fooxer.sampledaggerapp.R
import ru.fooxer.sampledaggerapp.domain.model.UserDetails
import ru.fooxer.sampledaggerapp.presentation.di.App
import ru.fooxer.sampledaggerapp.presentation.presenters.SecondPresenter
import javax.inject.Inject

class SecondActivity : AppCompatActivity(), SecondView {
    val TAG_USER_ID = "USER_ID"

    @Inject
    lateinit var presenter: SecondPresenter

    lateinit var textViewId: TextView
    lateinit var textViewFn: TextView
    lateinit var textViewLn: TextView
    lateinit var textViewAge: TextView
    lateinit var textViewCity: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        (applicationContext as App).appComponent.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        presenter.setView(this)
        presenter.setCurrentId(intent.getIntExtra(TAG_USER_ID, 0))

    }



    override fun onStart() {
        super.onStart()
        initView()
        presenter.onViewCreated()

    }

    override fun setContent(usr: UserDetails) {
        textViewId.text = usr.id.toString()
        textViewFn.text = usr.firstName
        textViewLn.text = usr.lastName
        textViewAge.text = usr.age.toString()
        textViewCity.text =  usr.city
    }

    fun initView() {
        textViewId = findViewById(R.id.tv_id_detailed)
        textViewFn = findViewById(R.id.tv_fn_detailed)
        textViewLn = findViewById(R.id.tv_ln_detailed)
        textViewAge = findViewById(R.id.tv_age_detailed)
        textViewCity = findViewById(R.id.tv_city_detailed)
    }
}