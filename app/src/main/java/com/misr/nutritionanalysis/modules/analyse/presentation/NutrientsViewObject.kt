package com.misr.nutritionanalysis.modules.analyse.presentation

import android.os.Parcelable
import com.misr.nutritionanalysis.core.extensions.roundTo
import com.misr.nutritionanalysis.modules.analyse.domain.NutritionalFactEntity
import kotlinx.android.parcel.Parcelize

@Parcelize data class NutrientsList(val nutrients: List<NutrientItem>):Parcelable

@Parcelize data class NutrientItem(
    val name: String,
    val quantity: String,
    val weight: String,
    val calories: Double
):Parcelable


fun NutritionalFactEntity.toViewObject() = NutrientsList(nutrients = ingredient
    .map { ingredient ->
        NutrientItem(
            name = ingredient.parsed[0].food,
            quantity = "${ingredient.parsed[0].quantity} ${ingredient.parsed[0].measure}",
            weight = "${ingredient.parsed[0].weight.roundTo(2)} g",
            calories = ingredient.parsed[0].nutrients.eNERCKCAL.quantity.roundTo(2)
        )
    })