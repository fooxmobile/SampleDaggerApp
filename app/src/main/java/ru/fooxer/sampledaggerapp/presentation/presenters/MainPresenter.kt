package ru.fooxer.sampledaggerapp.presentation.presenters

import ru.fooxer.sampledaggerapp.domain.interactor.UserInteractor
import ru.fooxer.sampledaggerapp.presentation.ui.MainView
import javax.inject.Inject

class MainPresenter @Inject constructor(
    private val interactor: UserInteractor
) : BasePresenter {

    private var view: MainView? = null

    fun setView(v: MainView) {
        view = v
    }

   override fun onViewCreated() {
        view?.setContent(interactor.users())
    }

    fun onItemClick(id: Int) {
        view?.navigateToDetails(id)
    }

    override fun onViewDestroyed() {
        view = null
    }
}