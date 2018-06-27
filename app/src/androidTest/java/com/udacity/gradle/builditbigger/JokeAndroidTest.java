package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getContext;
import static junit.framework.TestCase.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class JokeAndroidTest {
    @Test
    public void testForEmptyString() {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext());
        endpointsAsyncTask.execute(new Pair<Context, String>(getContext(), "This is a funny joke :)"));
        try {
            assertNotNull(endpointsAsyncTask.get());
            Log.d("LOG_TAG", "Received string: " + endpointsAsyncTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}