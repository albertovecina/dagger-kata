package com.example.daggerkata.di.module

import android.app.Activity
import com.example.daggerkata.data.DataRepository
import com.example.daggerkata.data.GetDataUseCase
import com.example.daggerkata.features.Navigator
import com.example.daggerkata.features.main.MainPresenter
import com.example.daggerkata.features.main.MainView
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    fun providesMainView(): MainView = (activity as MainView)

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