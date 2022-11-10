package com.example.cupcakeunit3application

import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest{
    //variable will global for all fun will be created

    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)


    @Test
    fun checkActivtyLayoutIsVisible(){
        Espresso.onView(withId(R.id.layout))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
    @Test
    fun checkImageVisibility(){
        Espresso.onView(withId(R.id.background_image))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
    @Test
    fun checkButtonClickable(){
        Espresso.onView(withId(R.id.dessert_button))
            .check(ViewAssertions.matches(ViewMatchers.isClickable()))
    }
    @Test
    fun testTextIsMain(){
        Espresso.onView(withId(R.id.dessert_sold_text))
            .check(ViewAssertions.matches(withText(R.string.dessert_sold)))
    }
}