package com.example.daggerkata.di.component.activity

import com.example.daggerkata.features.detail.DetailActivity
import com.example.daggerkata.features.detail.di.DetailActivityModule
import dagger.Subcomponent

@Subcomponent(modules = [DetailActivityModule::class])
interface DetailActivityComponent {

    fun inject(detailActivity: DetailActivity)

    @Subcomponent.Builder
    interface Builder {

        fun activityModule(detailActivityModule: DetailActivityModule): Builder

        fun build(): DetailActivityComponent

    }

}