package com.example.daggerkata.di.module

import android.content.Context
import com.example.daggerkata.data.DataRepository
import com.example.daggerkata.data.DataSource
import com.example.daggerkata.data.Zygote
import com.example.daggerkata.di.component.ActivityComponent
import dagger.Module
import dagger.Provides

@Module(subcomponents = [ActivityComponent::class])
class ApplicationModule(private val context: Context) {

    @Provides
    fun providesZygote(): Zygote = Zygote(context)

    @Provides
    fun providesDataSource(): DataSource = DataSource()

    @Provides
    fun providesDataRepository(dataSource: DataSource): DataRepository = DataRepository(dataSource)

}