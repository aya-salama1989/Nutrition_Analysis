package com.misr.nutritionanalysis.modules.summary

import androidx.lifecycle.ViewModel
import com.misr.nutritionanalysis.modules.analyse.domain.NutritionalFactEntity
import com.misr.nutritionanalysis.modules.analyse.presentation.NutrientsList
import javax.inject.Inject

class SummaryViewModel @Inject constructor() : ViewModel() {

    fun countTotalCalories(ingredients: NutrientsList): Double {
        var total = 0.0
        for (ingredient in ingredients.nutrients) {
            total += ingredient.calories
        }
        return total
    }

}