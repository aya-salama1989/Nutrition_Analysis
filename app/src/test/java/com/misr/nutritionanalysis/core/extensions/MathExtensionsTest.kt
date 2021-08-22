package com.misr.nutritionanalysis.core.extensions

import org.junit.Test

class MathExtensionsTest {

    @Test
    fun isDoubleNumberRoundedToTwoDecimals() {
       assert(35.0000434.roundTo(2).toString().length == 4)
    }
}