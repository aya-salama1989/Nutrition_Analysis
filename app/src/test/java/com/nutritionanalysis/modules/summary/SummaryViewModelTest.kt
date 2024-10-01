package com.nutritionanalysis.modules.summary

import com.nutritionanalysis.modules.analyse.presentation.NutrientItem
import com.nutritionanalysis.modules.analyse.presentation.NutrientsList
import org.junit.Test
import org.mockito.Mockito

class SummaryViewModelTest {


    var summaryViewModel: SummaryViewModel = Mockito.mock(SummaryViewModel::class.java)

    private val testData = arrayOf(
        NutrientItem("name1", "3", "22", 120.123),
        NutrientItem("name2", "4", "22", 12.123),
        NutrientItem("name3", "3", "21", 506.00)).toList()


    @Test
    fun totalCountCalorieTest(){
       assert(summaryViewModel.countTotalCalories(NutrientsList(nutrients = testData)) == 638.246)
    }
}