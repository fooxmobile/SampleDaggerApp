package ru.fooxer.sampledaggerapp.domain.usecase


/*
 * Created by fooxer on 27.11.2020
 */

abstract class UseCase<T, E> {
    abstract fun source(arg: E) : T
}