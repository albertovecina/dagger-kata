package com.example.daggerkata.features.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerkata.R
import com.example.daggerkata.di.module.ActivityModule
import com.example.daggerkata.extensions.getApplicationComponent
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainView {

    @Inject
    lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeInjector()
        initViews()
        presenter.onViewReady()
    }

    private fun initializeInjector() {
        getApplicationComponent()
            .activityComponentBuilder()
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)
    }

    private fun initViews() {
        buttonDetail.setOnClickListener { presenter.onDetailButtonClick() }
    }

    override fun render(data: String) {
        buttonDetail.text = data
    }

}