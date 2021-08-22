package com.misr.nutritionanalysis.modules.analyse.data.model


import com.google.gson.annotations.SerializedName

data class Ingredients(
    @SerializedName("ingr")
    val ingr: Array<String>
)