package com.nutritionanalysis.core

import com.nutritionanalysis.core.di.component.ApplicationComponent
import com.nutritionanalysis.core.di.component.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class BaseApplication: DaggerApplication() {

    val appComponent: ApplicationComponent = DaggerApplicationComponent.builder().application(this).build()

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>{
        return appComponent
    }
}
