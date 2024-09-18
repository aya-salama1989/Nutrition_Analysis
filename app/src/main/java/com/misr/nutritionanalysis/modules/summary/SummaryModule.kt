package com.misr.nutritionanalysis.modules.summary

import androidx.lifecycle.ViewModel
import com.misr.nutritionanalysis.core.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class SummaryFragmentModule {
    @ContributesAndroidInjector(
        modules = [
            SummaryViewModelModule::class
        ]

    )
    abstract fun bindAnalyseFragment(): SummaryFragment
}


@Module
abstract class SummaryViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(SummaryViewModel::class)
    abstract fun bindAnalyseViewModel(analyseViewModel: SummaryViewModel): ViewModel
}


