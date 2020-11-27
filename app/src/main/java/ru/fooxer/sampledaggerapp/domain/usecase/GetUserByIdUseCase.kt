package ru.fooxer.sampledaggerapp.domain.usecase

import ru.fooxer.sampledaggerapp.domain.model.User
import ru.fooxer.sampledaggerapp.domain.model.UserDetails
import ru.fooxer.sampledaggerapp.domain.repository.Repository
import javax.inject.Inject

class GetUserByIdUseCase @Inject constructor(
    private val repository: Repository
) : UseCase<UserDetails, Int>() {
    override fun source(arg: Int): UserDetails {
        return repository.userDetails(arg)
    }

}