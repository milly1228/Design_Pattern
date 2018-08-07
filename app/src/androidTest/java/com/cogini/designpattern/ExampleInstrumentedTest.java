package com.cogini.designpattern;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.cogini.designpattern.simple_factory.Adventurer;
import com.cogini.designpattern.simple_factory.TrainingCamp;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        Adventurer memberA = TrainingCamp.trainAdventurer("archer");
        Adventurer memberB = TrainingCamp.trainAdventurer("warrior");
        Assert.assertEquals(memberA.getType() , "Archer");
        Assert.assertEquals(memberB.getType() , "Warrior");
        assertEquals("com.cogini.designpattern", appContext.getPackageName());
    }
}
