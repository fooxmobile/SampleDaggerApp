package ru.fooxer.sampledaggerapp.presentation.ui

import ru.fooxer.sampledaggerapp.domain.model.User

interface MainView {

    fun setContent(content: ArrayList<User>)
    fun navigateToDetails(id: Int)

}
