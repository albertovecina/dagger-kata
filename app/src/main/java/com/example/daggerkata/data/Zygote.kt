package com.example.daggerkata.data

import android.content.Context
import android.widget.Toast

class Zygote(private val context: Context) {

    fun bigBang() = Toast.makeText(context, "Hola mundo", Toast.LENGTH_SHORT).show()

}