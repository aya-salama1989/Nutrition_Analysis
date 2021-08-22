package com.misr.nutritionanalysis.modules.analyse.domain

import com.misr.nutritionanalysis.modules.analyse.data.model.Ingredients

interface AnalyseRepo {
    suspend fun getAnalysis(ingr:Ingredients):NutritionalFactEntity
}