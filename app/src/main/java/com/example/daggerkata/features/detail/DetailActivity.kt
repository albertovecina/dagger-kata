package com.example.daggerkata.features.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.daggerkata.R

class DetailActivity : AppCompatActivity(), DetailView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

}