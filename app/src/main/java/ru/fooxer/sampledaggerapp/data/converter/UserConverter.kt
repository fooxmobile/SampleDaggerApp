package ru.fooxer.sampledaggerapp.data.converter

import ru.fooxer.sampledaggerapp.data.entity.UserEntity
import ru.fooxer.sampledaggerapp.domain.model.User
import javax.inject.Inject

class UserConverter @Inject constructor() : Converter<ArrayList<UserEntity>, ArrayList<User>> {
    override fun convert(from: ArrayList<UserEntity>): ArrayList<User> {
        val convertedArray = ArrayList<User>()
        from.forEach {
            convertedArray.add(
                User(
                    it.id,
                    it.firstName,
                    it.lastName,
                )
            )
        }
        return convertedArray
    }
}