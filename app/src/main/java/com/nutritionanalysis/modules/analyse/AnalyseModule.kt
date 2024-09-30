package com.nutritionanalysis.modules.analyse

import androidx.lifecycle.ViewModel
import com.nutritionanalysis.core.ViewModelKey
import com.nutritionanalysis.modules.analyse.data.AnalyseAPI
import com.nutritionanalysis.modules.analyse.data.AnalyseRepoImpl
import com.nutritionanalysis.modules.analyse.data.IngredientsAnalysisDS
import com.nutritionanalysis.modules.analyse.domain.AnalyseRepo
import com.nutritionanalysis.modules.analyse.presentation.fragments.AnalyseFragment
import com.nutritionanalysis.modules.analyse.presentation.viewmodel.AnalyseViewModel
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import retrofit2.Retrofit


@Module
abstract class AnalyseFragmentModule {
    @ContributesAndroidInjector(
        modules = [
            AnalyseViewModelModule::class,
            AnalyseAPIModule::class,
            AnalyseRepoModule::class
        ]

    )
    abstract fun bindAnalyseFragment(): AnalyseFragment
}


@Module
abstract class AnalyseViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(AnalyseViewModel::class)
    abstract fun bindAnalyseViewModel(analyseViewModel: AnalyseViewModel): ViewModel
}


@Module
class AnalyseAPIModule {
    @Provides
    fun provideAuthAPI(retrofit: Retrofit): AnalyseAPI {
        return retrofit.create(AnalyseAPI::class.java)
    }
}

@Module
class AnalyseRepoModule {
    @Provides
    fun provideAnalyseRepo(analysisDS: IngredientsAnalysisDS): AnalyseRepo =
        AnalyseRepoImpl(analysisDS)
}