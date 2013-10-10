package com.example.spike.test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Test.*;

import android.os.*;
import android.os.Bundle;
import android.test.ActivityTestCase;
import android.view.View;

import com.example.spike.MainActivity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric;

@RunWith(RobolectricTestRunner.class)
public class RoboTest extends ActivityTestCase {

    private MainActivity mainActivity;

    @Test
    public void testIncreaseSensitivityShouldBe31(){
        mainActivity = new MainActivity();

        mainActivity.onCreate(new Bundle());

        mainActivity.getIncreaseButton().performClick();

        assertEquals(31, mainActivity.getSensitivity());

    }
}
