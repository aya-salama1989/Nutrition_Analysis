package com.misr.nutritionanalysis

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.misr.nutritionanalysis.modules.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AnalysisFragmentTest {

    @Rule
    var activityScenarioRule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(
        MainActivity::class.java
    )

    @Test
    fun testFreeTextInputAreaIsDisplayed() {
        // Check if the input field is displayed and is large enough
        onView(withId(R.id.et_ingredients))
            .check(matches(isDisplayed()))
            .check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))
//            .check(matches(hasMinimumWidth(500))) // Adjust width as per your design
    }


    //1- If text view has valid text activate -> button is active
    //2- if text view has 0 text -> button is in active
    //3- if text view has invalid teat -> buttin inActive;
    //ONLY NUMBERS TEXT, only text text, jebbrish, spaces -> 3 test cases
}