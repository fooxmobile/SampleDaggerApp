package ru.fooxer.sampledaggerapp.data.converter

interface Converter <K, T> {

    fun convert (from: K): T
}