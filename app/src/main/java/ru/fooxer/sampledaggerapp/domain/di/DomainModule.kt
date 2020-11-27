package ru.fooxer.sampledaggerapp.domain.di

import dagger.Binds
import dagger.Module
import ru.fooxer.sampledaggerapp.domain.interactor.UserInteractor
import ru.fooxer.sampledaggerapp.domain.interactor.UserInteractorImpl
import ru.fooxer.sampledaggerapp.domain.repository.Repository
import ru.fooxer.sampledaggerapp.domain.repository.RepositoryImp

@Module

interface DomainModule {
    @Binds
    fun provideUserRepository(repository: RepositoryImp): Repository

    @Binds
    fun provideUserInteractor(interactor: UserInteractorImpl): UserInteractor


}