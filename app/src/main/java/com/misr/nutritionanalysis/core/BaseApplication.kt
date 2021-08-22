package com.misr.nutritionanalysis.core

import com.misr.nutritionanalysis.core.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class BaseApplication: DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>{
       return DaggerApplicationComponent.builder().application(this).build()
    }
}