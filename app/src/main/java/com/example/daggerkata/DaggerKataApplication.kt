package com.example.daggerkata

import android.app.Application
import android.content.Context
import com.example.daggerkata.data.DataRepository
import com.example.daggerkata.data.DataSource
import com.example.daggerkata.data.Zygote
import com.example.daggerkata.di.component.DaggerApplicationComponent
import javax.inject.Inject

class DaggerKataApplication : Application() {

    companion object {
        lateinit var dataRepository: DataRepository
        lateinit var applicationContext: Context
    }

    @Inject
    lateinit var zygote: Zygote

    override fun onCreate() {
        super.onCreate()
        DaggerKataApplication.applicationContext = this
        dataRepository = DataRepository(DataSource())

        DaggerApplicationComponent.create().inject(this)
        zygote.bigBang()
    }

}