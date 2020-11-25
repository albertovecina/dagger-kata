package com.example.daggerkata.features.main

import com.example.daggerkata.data.GetDataUseCase

class MainPresenter(private val view: MainView) {

    private val useCase = GetDataUseCase()

    fun onViewReady() {
        view.render(useCase.getData())
    }

    fun onDetailButtonClick() {
        view.navigateToDetail()
    }

}