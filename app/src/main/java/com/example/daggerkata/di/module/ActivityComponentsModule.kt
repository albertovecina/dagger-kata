package com.example.daggerkata.di.module

import com.example.daggerkata.di.component.activity.DetailActivityComponent
import com.example.daggerkata.di.component.activity.MainActivityComponent
import dagger.Module

@Module(subcomponents = [MainActivityComponent::class, DetailActivityComponent::class])
class ActivityComponentsModule {
}