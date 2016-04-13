package com.example.adam.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.example.adam.lab3test.MainActivity;
import com.example.adam.lab3test.R;

/**
 * Created by Adam on 4/13/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;

    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_sum() {
        mainActivity = getActivity();

        assertEquals(15, mainActivity.sum(10, 5));
        assertEquals(15, mainActivity.sum(12, 3));
        assertEquals(0, mainActivity.sum(-5, 5));
        assertEquals(2147483647, mainActivity.sum(2147483647, 0));
        assertEquals(2147483647, mainActivity.sum(10, 2147483637));
        assertEquals(-70, mainActivity.sum(-30, -40));

    }
}
