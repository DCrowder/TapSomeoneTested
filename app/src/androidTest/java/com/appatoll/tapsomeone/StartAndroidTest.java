package com.appatoll.tapsomeone;

import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import android.support.test.rule.ActivityTestRule;

import com.appatoll.tapsomeonetested.R;
import com.appatoll.tapsomeonetested.start.StartActivity;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withChild;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Unit tests for the implementation of {@link StartActivity}
 */

@RunWith(AndroidJUnit4.class)
public class StartAndroidTest {

    @Rule
    public ActivityTestRule<StartActivity> mStartActivityTestRule =
            new ActivityTestRule<>(StartActivity.class, false, true);

    @Test
    public void fragmentInflatesView(){
        onView(ViewMatchers.withId(R.id.activity_start))
                .check(matches(isDisplayed()));
    }

    @Test
    public void activity_hasStartButton(){
        onView(withId(R.id.activity_start))
                .check(matches(withChild(withId(R.id.start_button))));

    }

    // Start game button should start new activity
    @Test
    public void startGame_showsSetup(){

        onView(withId(R.id.start_button))
                .perform(click());

        onView(withId(R.id.fragment_setup))
                .check(matches(isDisplayed()));
    }

}
