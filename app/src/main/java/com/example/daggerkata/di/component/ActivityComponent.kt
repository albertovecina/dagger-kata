package com.example.daggerkata.di.component

import com.example.daggerkata.di.module.ActivityModule
import com.example.daggerkata.features.main.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {

        fun activityModule(activityModule: ActivityModule): Builder

        fun build(): ActivityComponent

    }

}