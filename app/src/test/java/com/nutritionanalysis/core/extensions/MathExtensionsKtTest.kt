package com.nutritionanalysis.core.extensions

import org.junit.Test

class MathExtensionsKtTest{
    @Test
    fun isDoubleNumberRoundedToTwoDecimals() {
        assert(35.0000434.roundTo(2).toString().length == 4)
    }
}