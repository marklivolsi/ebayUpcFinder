package com.mcl.helpers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;

public class UserInputTest {

    @After
    public void revertSystemInput() {
        System.setIn(System.in);
    }

    @Test
    public void testGetInputReturnsCorrectValue() {
        System.setIn(new ByteArrayInputStream("883929032273".getBytes()));
        Assert.assertEquals("883929032273", new UserInput().getInput());
    }

    @Test
    public void testGetMultiLineInputReturnsCorrectValue() {
        ArrayList<String> testArray = new ArrayList<>();
        testArray.add("883929032273");
        testArray.add("093r980");
        testArray.add("abced");
        System.setIn(new ByteArrayInputStream("883929032273\n093r980\nabced".getBytes()));
    }

}
