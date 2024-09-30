package com.nutritionanalysis.core.di.module

import androidx.lifecycle.ViewModel
import com.nutritionanalysis.modules.MainViewModel
import com.nutritionanalysis.core.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class MainViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindAuthViewModel(viewModel: MainViewModel): ViewModel
}