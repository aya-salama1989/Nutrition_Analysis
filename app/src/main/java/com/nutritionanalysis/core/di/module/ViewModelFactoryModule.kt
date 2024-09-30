package com.nutritionanalysis.core.di.module

import androidx.lifecycle.ViewModelProvider
import com.nutritionanalysis.core.BaseViewModelProvider
import dagger.Binds
import dagger.Module


@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun bindViewModelFactory(baseViewModelFactory: BaseViewModelProvider): ViewModelProvider.Factory
}