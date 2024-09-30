package com.nutritionanalysis.core.di.component

import android.app.Application
import com.nutritionanalysis.core.BaseApplication
import com.nutritionanalysis.core.di.module.ActivityBuilderModule
import com.nutritionanalysis.core.di.module.NetworkModule
import com.nutritionanalysis.core.di.module.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        NetworkModule::class,
        ActivityBuilderModule::class,
        ViewModelFactoryModule::class]
)

interface ApplicationComponent : AndroidInjector<BaseApplication> {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): ApplicationComponent
    }
}