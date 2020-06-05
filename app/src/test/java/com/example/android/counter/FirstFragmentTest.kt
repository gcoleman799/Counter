@file:Suppress("DEPRECATION")

package com.example.android.counter


import android.view.View
import android.widget.TextView
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.NoMatchingViewException
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.runner.AndroidJUnit4
import kotlinx.android.synthetic.main.fragment_first.view.*
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class FirstFragmentTest {

    @Test
    fun testEventFragment() {
        // Given an instance of FirstFragment
        val scenario = launchFragmentInContainer<FirstFragment>()
            .moveToState(Lifecycle.State.RESUMED)

        scenario.onFragment { fragment ->
            val countButton = fragment.view!!.findViewById<View>(R.id.button_count_up)
            val numberView = fragment.view!!.findViewById<TextView>(R.id.number)

            // ...when the count is 0 and the up button is clicked...
            countButton.performClick()

            // The counter goes from 0 to 1
            Assert.assertEquals(numberView.text, "1")
        }
    }

}