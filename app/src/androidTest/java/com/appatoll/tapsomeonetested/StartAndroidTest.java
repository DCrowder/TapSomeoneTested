package com.appatoll.tapsomeonetested;

import android.support.test.runner.AndroidJUnit4;
import android.support.test.InstrumentationRegistry;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.rules.TestRule;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;
import android.view.View;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.instanceOf;

@RunWith(AndroidJUnit4.class)
public class StartAndroidTest {

    private StartFragment mStartFragment;

    @Rule
    public ActivityTestRule<StartActivity> mStartActivityActivityTestRule =
            new ActivityTestRule<>(StartActivity.class, false, true);
    @Before
    public void init(){
        mStartFragment = (StartFragment) mStartActivityActivityTestRule.getActivity()
                .createFragment();
    }

    @Test
    public void fragmentInflatesView(){
        onView(withId(R.id.activity_start))
                .check(matches(isDisplayed()));
    }
}
