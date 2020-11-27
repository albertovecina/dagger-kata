package com.example.daggerkata.features.detail

class DetailPresenter(private val view: DetailView) {

    fun onViewReady() {
        view.render()
    }

}