package ru.fooxer.sampledaggerapp.data.di

import dagger.Module
import dagger.Provides
import ru.fooxer.sampledaggerapp.data.UserDatabase

@Module
class DataModule {
    @Provides
    fun provideUserDatabase(): UserDatabase {
        return UserDatabase()
    }
}