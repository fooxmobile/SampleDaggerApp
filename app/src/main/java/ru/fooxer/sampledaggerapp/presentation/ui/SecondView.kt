package ru.fooxer.sampledaggerapp.presentation.ui

import ru.fooxer.sampledaggerapp.domain.model.UserDetails

interface SecondView {
    fun setContent(usr: UserDetails)
}
