package com.example.daggerkata.features.detail.di

import com.example.daggerkata.features.detail.DetailActivity
import com.example.daggerkata.features.detail.DetailPresenter
import com.example.daggerkata.features.detail.DetailView
import dagger.Module
import dagger.Provides

@Module
class DetailActivityModule(private val activity: DetailActivity) {

    @Provides
    fun providesView(): DetailView = activity

    @Provides
    fun providesPresenter(view: DetailView): DetailPresenter = DetailPresenter(view)


}