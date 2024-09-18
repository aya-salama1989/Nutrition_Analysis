package com.misr.nutritionanalysis.modules.analyse.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.misr.nutritionanalysis.modules.analyse.domain.AnalyseIngredientsUC
import com.misr.nutritionanalysis.modules.analyse.presentation.NutrientsList
import com.misr.nutritionanalysis.modules.analyse.presentation.toViewObject
import kotlinx.coroutines.launch
import javax.inject.Inject

class AnalyseViewModel @Inject constructor(private val analyseIngredientsUC: AnalyseIngredientsUC) :
    ViewModel() {

    private val _nutritionalLiveData = MutableLiveData<NutrientsList>()
    val nutritionalLiveData: LiveData<NutrientsList> get() = _nutritionalLiveData

    fun getAnalysis(ingr: String) {
        viewModelScope.launch {
            _nutritionalLiveData.value = analyseIngredientsUC.getAnalysis(ingr).toViewObject()
        }
    }
}