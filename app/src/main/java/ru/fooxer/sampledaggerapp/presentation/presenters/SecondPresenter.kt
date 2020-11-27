package ru.fooxer.sampledaggerapp.presentation.presenters

import ru.fooxer.sampledaggerapp.domain.interactor.UserInteractor
import ru.fooxer.sampledaggerapp.presentation.ui.SecondView
import javax.inject.Inject

class SecondPresenter @Inject constructor(
    private val interactor: UserInteractor
)  : BasePresenter {

    private var view: SecondView? = null
    private var currentId: Int = 0

    fun setView(v: SecondView) {
        view = v
    }
    fun setCurrentId(id: Int) {
        currentId = id
    }

   override fun onViewCreated() {
        view?.setContent(interactor.userById(currentId))
    }


    override fun onViewDestroyed() {
        view = null
    }

}