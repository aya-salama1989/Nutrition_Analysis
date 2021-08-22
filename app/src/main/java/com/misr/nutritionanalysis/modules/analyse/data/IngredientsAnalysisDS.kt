package com.misr.nutritionanalysis.modules.analyse.data

import com.misr.nutritionanalysis.modules.analyse.data.model.AnalysePostResponse
import com.misr.nutritionanalysis.modules.analyse.data.model.Ingredients
import javax.inject.Inject

class IngredientsAnalysisDS @Inject constructor(private val analyse: AnalyseAPI) {

    suspend fun analyseIngredients(ingredients: Ingredients): AnalysePostResponse {
        return analyse.postIngredientAnalysis(ingredients = ingredients)
    }

}