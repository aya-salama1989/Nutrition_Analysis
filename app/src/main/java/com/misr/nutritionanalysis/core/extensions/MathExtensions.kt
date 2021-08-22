package com.misr.nutritionanalysis.core.extensions

fun Double.roundTo(n : Int) : Double {
    return "%.${n}f".format(this).toDouble()
}