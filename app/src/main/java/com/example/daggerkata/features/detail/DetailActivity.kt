package com.example.daggerkata.features.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerkata.R
import com.example.daggerkata.extensions.getApplicationComponent
import com.example.daggerkata.features.detail.di.DetailActivityModule
import javax.inject.Inject

class DetailActivity : AppCompatActivity(), DetailView {

    @Inject
    lateinit var presenter: DetailPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        initializeInjector()
        presenter.onViewReady()
    }

    private fun initializeInjector() {
        getApplicationComponent()
            .detailComponentBuilder()
            .activityModule(DetailActivityModule(this))
            .build()
            .inject(this)
    }

    override fun render() {

    }

}