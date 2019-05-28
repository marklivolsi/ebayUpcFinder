package com.mcl.utilities;

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
        System.setIn(new ByteArrayInputStream("test".getBytes()));
        Assert.assertEquals("test", new UserInput().getInput());
    }

    @Test
    public void testGetMultiLineInputReturnsCorrectArray() {
        ArrayList<String> testArray = new ArrayList<>();
        testArray.add("this");
        testArray.add("is");
        testArray.add("test");
        System.setIn(new ByteArrayInputStream("this\nis\ntest".getBytes()));
        Assert.assertEquals(testArray, new UserInput().getMultiLineInput());
    }

}
