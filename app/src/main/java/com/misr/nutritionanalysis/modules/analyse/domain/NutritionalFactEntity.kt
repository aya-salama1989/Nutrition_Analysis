package com.misr.nutritionanalysis.modules.analyse.domain

import android.os.Parcelable
import com.misr.nutritionanalysis.modules.analyse.data.model.AnalysePostResponse
import com.misr.nutritionanalysis.modules.analyse.data.model.Ingredient
import kotlinx.android.parcel.Parcelize


@Parcelize
data class NutritionalFactEntity(val ingredient: List<Ingredient>) : Parcelable
