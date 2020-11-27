package com.example.daggerkata.di.component.activity

import com.example.daggerkata.features.main.MainActivity
import com.example.daggerkata.features.main.di.MainActivityModule
import dagger.Subcomponent

@Subcomponent(modules = [MainActivityModule::class])
interface MainActivityComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {

        fun activityModule(mainActivityModule: MainActivityModule): Builder

        fun build(): MainActivityComponent

    }

}