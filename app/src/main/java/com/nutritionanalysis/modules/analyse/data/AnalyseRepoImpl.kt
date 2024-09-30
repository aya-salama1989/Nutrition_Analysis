package com.nutritionanalysis.modules.analyse.data

import com.nutritionanalysis.modules.analyse.data.model.AnalysePostResponse
import com.nutritionanalysis.modules.analyse.data.model.Ingredients
import com.nutritionanalysis.modules.analyse.domain.AnalyseRepo
import com.nutritionanalysis.modules.analyse.domain.NutritionalFactEntity
import javax.inject.Inject

class AnalyseRepoImpl @Inject constructor(private val ingredientsAnalysisDS:
                                          IngredientsAnalysisDS):AnalyseRepo {

    override suspend fun getAnalysis(ingr: Ingredients): NutritionalFactEntity {
      return  ingredientsAnalysisDS.analyseIngredients(ingr).toEntity()
    }
}

fun AnalysePostResponse.toEntity()
= NutritionalFactEntity(ingredient = ingredients)