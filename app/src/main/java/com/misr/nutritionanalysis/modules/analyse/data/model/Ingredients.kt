package com.misr.nutritionanalysis.modules.analyse.data.model


import com.google.gson.annotations.SerializedName

data class Ingredients(
    @SerializedName("ingr")
    val ingredient: Array<String>
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Ingredients

        return ingredient.contentEquals(other.ingredient)
    }

    override fun hashCode(): Int {
        return ingredient.contentHashCode()
    }
}