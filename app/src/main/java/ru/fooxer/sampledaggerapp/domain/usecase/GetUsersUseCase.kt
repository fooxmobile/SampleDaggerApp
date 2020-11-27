package ru.fooxer.sampledaggerapp.domain.usecase

import ru.fooxer.sampledaggerapp.domain.model.User
import ru.fooxer.sampledaggerapp.domain.repository.Repository
import javax.inject.Inject


/*
 * Created by fooxer on 27.11.2020
 */

class GetUsersUseCase@Inject constructor(
    private val repository: Repository
) : UseCase<ArrayList<User>,Int>() {
    override fun source(arg: Int): ArrayList<User> {
        return repository.users()
    }

}