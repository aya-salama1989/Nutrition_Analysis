package com.nutritionanalysis.modules.analyse.domain

import com.nutritionanalysis.modules.analyse.data.model.Ingredients

interface AnalyseRepo {
    suspend fun getAnalysis(ingr:Ingredients):NutritionalFactEntity
}