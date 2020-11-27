package ru.fooxer.sampledaggerapp.presentation.di

import dagger.Component
import ru.fooxer.sampledaggerapp.data.di.DataModule
import ru.fooxer.sampledaggerapp.domain.di.DomainModule
import ru.fooxer.sampledaggerapp.presentation.ui.MainActivity
import ru.fooxer.sampledaggerapp.presentation.ui.SecondActivity

@Component (modules = [
    DataModule::class,
    DomainModule::class,
    PresenterModule::class
])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
    fun inject(activity: SecondActivity)
}