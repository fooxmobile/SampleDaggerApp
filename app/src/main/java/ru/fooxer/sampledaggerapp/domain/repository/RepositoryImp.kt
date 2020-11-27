package ru.fooxer.sampledaggerapp.domain.repository

import ru.fooxer.sampledaggerapp.data.UserDatabase
import ru.fooxer.sampledaggerapp.data.converter.UserConverter
import ru.fooxer.sampledaggerapp.data.converter.UserDetailsConverter
import ru.fooxer.sampledaggerapp.domain.model.User
import ru.fooxer.sampledaggerapp.domain.model.UserDetails
import javax.inject.Inject

class RepositoryImp @Inject constructor(
    private val database: UserDatabase,
    private val userConverter: UserConverter,
    private val userDetailsConverter: UserDetailsConverter,
)
    : Repository {
    override fun users(): ArrayList<User> {
        return userConverter.convert(database.getAllUsers())
    }

    override fun userDetails(id: Int): UserDetails {
        return userDetailsConverter.convert(database.getUserById(id))
    }
}