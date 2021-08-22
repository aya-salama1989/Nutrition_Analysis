package com.misr.nutritionanalysis.core.di.module

import com.misr.nutritionanalysis.modules.MainActivity
import com.misr.nutritionanalysis.modules.analyse.AnalyseFragmentModule
import com.misr.nutritionanalysis.modules.analyse.SummaryFragmentModule
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