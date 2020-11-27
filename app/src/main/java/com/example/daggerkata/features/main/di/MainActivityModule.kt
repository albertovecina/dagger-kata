package com.example.daggerkata.features.main.di

import com.example.daggerkata.data.DataRepository
import com.example.daggerkata.data.GetDataUseCase
import com.example.daggerkata.features.Navigator
import com.example.daggerkata.features.main.MainActivity
import com.example.daggerkata.features.main.MainPresenter
import com.example.daggerkata.features.main.MainView
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule(private val activity: MainActivity) {

    @Provides
    fun providesMainView(): MainView = activity

    @Provides
    fun providesGetDataUseCase(dataRepository: DataRepository): GetDataUseCase =
        GetDataUseCase(dataRepository)

    @Provides
    fun providesNavigator(): Navigator = Navigator(activity)

    @Provides
    fun providesMainPresenter(
        view: MainView,
        getDataUseCase: GetDataUseCase,
        navigator: Navigator
    ): MainPresenter =
        MainPresenter(view, getDataUseCase, navigator)


}