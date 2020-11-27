package ru.fooxer.sampledaggerapp.presentation.di

import android.app.Application


/*
 * Created by fooxer on 27.11.2020
 */

class App: Application() {
    val appComponent = DaggerApplicationComponent.create()

}
