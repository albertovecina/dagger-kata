package com.example.daggerkata.di.component

import com.example.daggerkata.DaggerKataApplication
import com.example.daggerkata.di.component.activity.DetailActivityComponent
import com.example.daggerkata.di.component.activity.MainActivityComponent
import com.example.daggerkata.di.module.ActivityComponentsModule
import com.example.daggerkata.di.module.ApplicationModule
import dagger.Component

@Component(modules = [ApplicationModule::class, ActivityComponentsModule::class])
interface ApplicationComponent {

    fun inject(application: DaggerKataApplication)

    fun mainComponentBuilder(): MainActivityComponent.Builder

    fun detailComponentBuilder(): DetailActivityComponent.Builder

    @Component.Builder
    interface Builder {

        fun applicationModule(applicationModule: ApplicationModule): Builder

        fun build(): ApplicationComponent

    }

}