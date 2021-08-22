package com.misr.nutritionanalysis.modules.summary

import com.misr.nutritionanalysis.modules.analyse.presentation.NutrientItem
import com.misr.nutritionanalysis.modules.analyse.presentation.NutrientsList
import org.junit.Test
import java.lang.annotation.Inherited
import javax.inject.Inject

class SummaryViewModelTest {

    @Inject
    lateinit var summaryViewModel: SummaryViewModel

    private val testData = arrayOf(NutrientItem("name1", "3", "22", 120.123),
        NutrientItem("name2", "4", "22", 12.123),
        NutrientItem("name3", "3", "21", 506.00)).toList()

    @Test
    fun totalCountCalorieTest(){
       assert(summaryViewModel.countTotalCalories(NutrientsList(nutrients = testData)) == 638.24)
    }
}