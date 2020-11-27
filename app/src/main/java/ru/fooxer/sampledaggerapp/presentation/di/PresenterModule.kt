package ru.fooxer.sampledaggerapp.presentation.di

import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import ru.fooxer.sampledaggerapp.presentation.presenters.BasePresenter
import ru.fooxer.sampledaggerapp.presentation.presenters.MainPresenter
import ru.fooxer.sampledaggerapp.presentation.presenters.SecondPresenter

@Module
interface PresenterModule {
    @Binds
    fun provideMainPresenter(presenter: MainPresenter): BasePresenter

    @Binds
    fun provideSecondPresenter(presenter: SecondPresenter): BasePresenter


}