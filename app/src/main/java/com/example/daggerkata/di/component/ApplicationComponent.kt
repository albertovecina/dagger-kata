package com.example.daggerkata.di.component

import com.example.daggerkata.DaggerKataApplication
import com.example.daggerkata.di.module.ApplicationModule
import dagger.Component

@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: DaggerKataApplication)

    @Component.Builder
    interface Builder {

        fun applicationModule(applicationModule: ApplicationModule): Builder

        fun build(): ApplicationComponent

    }

}