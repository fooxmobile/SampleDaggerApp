package ru.fooxer.sampledaggerapp.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import ru.fooxer.sampledaggerapp.R
import ru.fooxer.sampledaggerapp.domain.model.User

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false) : View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}

class UsersRecyclerAdapter (val onClickFun: (Int) -> Unit) : RecyclerView.Adapter<UsersRecyclerAdapter.UserViewHolder>() {

    private var users = arrayListOf<User>()

    fun update(users: ArrayList<User>) {
        this.users = users
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): UsersRecyclerAdapter.UserViewHolder =
        UserViewHolder(parent.inflate(R.layout.item_user_compact, false)).apply {
            itemView.setOnClickListener {
                onClick(it)
            }
        }


    override fun onBindViewHolder(holder: UsersRecyclerAdapter.UserViewHolder, position: Int) {
        holder.bind(users.get(position))

    }

    override fun getItemCount(): Int {
        return users.size
    }

    inner class UserViewHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        private var usId = 0
        private lateinit var idTv: TextView
        private lateinit var fnTv: TextView
        private lateinit var lnTv: TextView

        init {
            idTv = v.findViewById(R.id.tv_id)
            fnTv = v.findViewById(R.id.tv_firstName)
            lnTv = v.findViewById(R.id.tv_lastName)
        }


        fun bind(user: User) {
            idTv.text = user.id.toString()
            fnTv.text = user.firstName
            lnTv.text = user.lastName
            usId = user.id
        }

        override fun onClick(v: View?) {
            onClickFun.invoke(usId)
        }


    }
}