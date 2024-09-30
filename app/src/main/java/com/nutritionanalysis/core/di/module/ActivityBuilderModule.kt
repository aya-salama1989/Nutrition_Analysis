package com.nutritionanalysis.core.di.module

import com.nutritionanalysis.modules.MainActivity
import com.nutritionanalysis.modules.analyse.AnalyseFragmentModule
import com.nutritionanalysis.modules.summary.SummaryFragmentModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(
        modules = [
            AnalyseFragmentModule::class, SummaryFragmentModule::class
        ]
    )
    abstract fun injectMainActivity(): MainActivity
}