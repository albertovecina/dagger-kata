package com.example.daggerkata.di.module

import com.example.daggerkata.data.Zygote
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule {

    @Provides
    fun providesZygote(): Zygote = Zygote()

}