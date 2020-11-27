package ru.fooxer.sampledaggerapp.domain.interactor

import ru.fooxer.sampledaggerapp.data.UserDatabase
import ru.fooxer.sampledaggerapp.domain.model.User
import ru.fooxer.sampledaggerapp.domain.model.UserDetails

interface UserInteractor {
    fun users() : ArrayList<User>
    fun userById(id: Int) : UserDetails

}