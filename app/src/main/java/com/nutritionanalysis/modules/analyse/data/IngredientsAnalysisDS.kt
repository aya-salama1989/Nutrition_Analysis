package com.nutritionanalysis.modules.analyse.data

import com.nutritionanalysis.modules.analyse.data.model.AnalysePostResponse
import com.nutritionanalysis.modules.analyse.data.model.Ingredients
import javax.inject.Inject

class IngredientsAnalysisDS @Inject constructor(private val analyse: AnalyseAPI) {

    suspend fun analyseIngredients(ingredients: Ingredients): AnalysePostResponse {
        return analyse.postIngredientAnalysis(ingredients = ingredients)
    }
}