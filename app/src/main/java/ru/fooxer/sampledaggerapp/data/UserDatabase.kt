package ru.fooxer.sampledaggerapp.data

import ru.fooxer.sampledaggerapp.data.entity.UserEntity


/*
 * Created by fooxer on 27.11.2020
 */

class UserDatabase {

    private val users = arrayListOf(
        UserEntity(152, "Ted", "Mosby", 30, "New York", "tedmosby"),
        UserEntity(189, "Barney", "Stinson", 34, "New York", "legendarybro"),
        UserEntity(556, "Robin", "Sherbatsky", 30, "Toronto", "robinsparkle"),

    )

    fun getAllUsers() : ArrayList<UserEntity> = users
    fun getUserById(id: Int) = users.find { it.id == id }
}