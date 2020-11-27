package ru.fooxer.sampledaggerapp.data.converter

import ru.fooxer.sampledaggerapp.data.entity.UserEntity
import ru.fooxer.sampledaggerapp.domain.model.UserDetails
import javax.inject.Inject

class UserDetailsConverter @Inject constructor()  : Converter <UserEntity?,UserDetails> {
    override fun convert(from: UserEntity?): UserDetails {
        if (from != null) {
            return UserDetails(
                from.id,
                from.firstName,
                from.lastName,
                from.age,
                from.city
            )
        }
        else return UserDetails(
            0,
            "NULL",
            "NULL",
            0,
            "NULL"
        )
    }
}