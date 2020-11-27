package com.example.daggerkata.features

import android.content.Context
import android.content.Intent
import com.example.daggerkata.features.detail.DetailActivity

class Navigator(private val context: Context) {

    fun navigateToDetail() = context.startActivity(Intent(context, DetailActivity::class.java))

}