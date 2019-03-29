package com.example.administrator.myapplication;

import android.support.test.rule.ActivityTestRule;

import android.support.test.espresso.Espresso;
import android.util.Log;
import android.widget.EditText;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.action.ViewActions.typeTextIntoFocusedView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity>mainActivityActivityTestRule = new
            ActivityTestRule<>(MainActivity.class);
    private MainActivity mainActivity = null;

    @Before
    public void setUp() throws Exception {
        mainActivity = mainActivityActivityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
    }



    @Test
    public void testLaunchSecondActivityOnButtonClick(){
        mainActivity.findViewById(R.id.button2);
        Espresso.onView(withId(R.id.button2)).perform(click());
    }

    @Test
    public void testGetTextBtn(){
        mainActivity.findViewById(R.id.editText);
        mainActivity.findViewById(R.id.button);
        Espresso.onView(withId(R.id.editText)).perform(typeText("This is an edit text"));
        Espresso.onView(withId(R.id.button)).perform(click());
    }

}