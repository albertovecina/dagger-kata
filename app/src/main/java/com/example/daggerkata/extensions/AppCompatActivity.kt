package com.example.daggerkata.extensions

import androidx.appcompat.app.AppCompatActivity
import com.example.daggerkata.DaggerKataApplication

fun AppCompatActivity.getApplicationComponent() =
    (this.applicationContext as DaggerKataApplication).applicationComponent