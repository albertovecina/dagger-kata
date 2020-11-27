package com.example.daggerkata.features.main

import com.example.daggerkata.data.GetDataUseCase
import com.example.daggerkata.features.Navigator

class MainPresenter(
    private val view: MainView,
    private val useCase: GetDataUseCase,
    private val navigator:Navigator
) {

    fun onViewReady() {
        view.render(useCase.getData())
    }

    fun onDetailButtonClick() {
        navigator.navigateToDetail()
    }

}