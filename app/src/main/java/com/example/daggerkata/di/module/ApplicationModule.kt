package com.example.daggerkata.di.module

import android.content.Context
import com.example.daggerkata.data.Zygote
import dagger.Module
import dagger.Provides

@Module
class ApplicationModule(private val context: Context) {

    @Provides
    fun providesZygote(): Zygote = Zygote(context)

}