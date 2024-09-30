package com.nutritionanalysis.modules.analyse.domain

import android.os.Parcelable
import com.nutritionanalysis.modules.analyse.data.model.Ingredient
import kotlinx.parcelize.Parcelize


@Parcelize
data class NutritionalFactEntity(val ingredient: List<Ingredient>) : Parcelable
