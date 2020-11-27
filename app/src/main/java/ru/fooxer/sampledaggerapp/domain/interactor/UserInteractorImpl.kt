package ru.fooxer.sampledaggerapp.domain.interactor

import ru.fooxer.sampledaggerapp.domain.model.User
import ru.fooxer.sampledaggerapp.domain.model.UserDetails
import ru.fooxer.sampledaggerapp.domain.usecase.GetUserByIdUseCase
import ru.fooxer.sampledaggerapp.domain.usecase.GetUsersUseCase
import javax.inject.Inject


/*
 * Created by fooxer on 27.11.2020
 */

class UserInteractorImpl @Inject constructor(
    private val getUsersUseCase: GetUsersUseCase,
    private val getUserByIdUseCase: GetUserByIdUseCase,
) : UserInteractor  {
    override fun users(): ArrayList<User> {
        return getUsersUseCase.source(0)
    }

    override fun userById(id: Int): UserDetails {
        return getUserByIdUseCase.source(id)
    }

}