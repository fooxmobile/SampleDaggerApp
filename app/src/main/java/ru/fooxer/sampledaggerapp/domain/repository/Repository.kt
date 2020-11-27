package ru.fooxer.sampledaggerapp.domain.repository

import ru.fooxer.sampledaggerapp.domain.model.User
import ru.fooxer.sampledaggerapp.domain.model.UserDetails

interface Repository {

    fun users() : ArrayList<User>
    fun userDetails(id: Int) : UserDetails
}