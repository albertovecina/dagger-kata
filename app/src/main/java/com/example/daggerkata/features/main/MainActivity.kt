package com.example.daggerkata.features.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggerkata.R
import com.example.daggerkata.features.detail.DetailActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {

    private val presenter: MainPresenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
        presenter.onViewReady()
    }

    private fun initViews() {
        buttonDetail.setOnClickListener { presenter.onDetailButtonClick() }
    }

    override fun render(data: String) {
        buttonDetail.text = data
    }

    override fun navigateToDetail() {
        startActivity(Intent(this, DetailActivity::class.java))
    }

}