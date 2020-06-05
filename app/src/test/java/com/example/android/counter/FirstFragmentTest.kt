@file:Suppress("DEPRECATION")

package com.example.android.counter



import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.runner.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule


@RunWith(AndroidJUnit4::class)

class FirstFragmentTest {
    private val STRING_TO_BE_TYPED = "Espresso"
//
//        @Rule
//    var activityScenarioRule =
//        ActivityScenarioRule(
//            MainActivity::class.java
//        )
//
    @Test fun testEventFragment() {
        val scenario = launchFragmentInContainer<FirstFragment>()
        scenario.recreate()
        onView(withId(R.id.button_toast))
            .perform(click())
    }
//    @Test
//    fun onViewCreated() {
//        onView(withId(R.id.button_toast))
//
//
//    }
//
//
//    @Test
//    fun changeText_sameActivity() {
//        //locate the button and click it
//        onView(withId(R.id.button_submit)).perform(click())
//
//        // Check that the text was changed.
//        onView(withId(R.id.numberName)).check(matches(withText(STRING_TO_BE_TYPED)));
//    }

}