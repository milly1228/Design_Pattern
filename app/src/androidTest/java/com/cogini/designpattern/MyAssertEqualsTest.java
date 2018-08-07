package com.cogini.designpattern;

import com.cogini.designpattern.simple_factory.Adventurer;
import com.cogini.designpattern.simple_factory.TrainingCamp;

import junit.framework.Assert;

import org.junit.Test;

public class MyAssertEqualsTest {
    @Test
    public void mySimpleEqualsTest(){

        Adventurer memberA = TrainingCamp.trainAdventurer("archer");
        Adventurer memberB = TrainingCamp.trainAdventurer("warrior");
        //Test if
        Assert.assertEquals(memberA.getType() , "Archer");
        Assert.assertEquals(memberB.getType() , "Warrior");
    }
}
