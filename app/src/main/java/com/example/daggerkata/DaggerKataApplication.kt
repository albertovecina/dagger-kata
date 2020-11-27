package com.example.daggerkata

import android.app.Application
import android.content.Context
import com.example.daggerkata.data.DataRepository
import com.example.daggerkata.data.DataSource
import com.example.daggerkata.data.Zygote
import com.example.daggerkata.di.component.ApplicationComponent
import com.example.daggerkata.di.component.DaggerApplicationComponent
import com.example.daggerkata.di.module.ApplicationModule
import javax.inject.Inject

class DaggerKataApplication : Application() {

    companion object {
        lateinit var applicationContext: Context
    }

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var zygote: Zygote

    override fun onCreate() {
        super.onCreate()
        DaggerKataApplication.applicationContext = this

        applicationComponent = DaggerApplicationComponent
            .builder()
            .applicationModule(ApplicationModule(this))
            .build()
        applicationComponent.inject(this)

        zygote.bigBang()
    }

}