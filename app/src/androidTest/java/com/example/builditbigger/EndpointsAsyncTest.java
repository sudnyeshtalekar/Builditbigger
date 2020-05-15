package com.example.builditbigger;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.udacity.gradle.builditbigger.MainActivity;
import com.udacity.gradle.builditbigger.R;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.udacity.gradle.builditbigger.MainActivity.EndpointsAsyncTask;

@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTest{

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testJokeIsNotEmpty() throws Exception {

        onView(withId(R.id.jokeBtn)).perform(click());
        onView(withId(R.id.jokeText)).check(matches(isDisplayed()));
        EndpointsAsyncTask aTest =  new EndpointsAsyncTask();
        aTest.execute(InstrumentationRegistry.getTargetContext());
        String joke = aTest.get(25, TimeUnit.SECONDS);
        Assert.assertNotEquals("", joke);
	 
}

}
