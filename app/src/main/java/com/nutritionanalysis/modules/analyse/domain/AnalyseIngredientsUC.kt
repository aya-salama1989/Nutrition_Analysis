package com.nutritionanalysis.modules.analyse.domain

import com.nutritionanalysis.modules.analyse.data.model.Ingredients
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class AnalyseIngredientsUC @Inject constructor(private val analyseRepo: AnalyseRepo) {

    suspend fun getAnalysis(inger: String): NutritionalFactEntity {
        return withContext(Dispatchers.IO) {
            analyseRepo.getAnalysis(ingr = inger.toIngredients())
        }
    }
}


fun String.toIngredients(): Ingredients {
    return if (contains("\n")) {
        Ingredients(split("\n").toTypedArray())
    } else {
        Ingredients(arrayOf(this))
    }
}