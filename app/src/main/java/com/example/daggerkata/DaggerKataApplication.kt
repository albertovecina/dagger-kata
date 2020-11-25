package com.example.daggerkata

import android.app.Application
import android.content.Context
import com.example.daggerkata.data.DataRepository

class DaggerKataApplication : Application() {

    companion object {
        lateinit var dataRepository: DataRepository
        lateinit var applicationContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        DaggerKataApplication.applicationContext = this
        dataRepository = DataRepository()
    }

}