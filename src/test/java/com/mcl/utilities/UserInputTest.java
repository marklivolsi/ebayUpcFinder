package com.mcl.utilities;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

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

    @Test
    public void testGetValidatedInputReturnsValidValue() {
        String expected = "883929032273";
        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        String actual = new UserInput().getValidatedInput("Test prompt", str -> str.matches("\\d+"));
        Assert.assertEquals(expected, actual);
    }

    @Test (expected = NoSuchElementException.class)
    public void testGetValidatedInputTimesOutForInvalidValue() throws NoSuchElementException {
        String expected = "12ab";
        System.setIn(new ByteArrayInputStream(expected.getBytes()));
        String actual = new UserInput().getValidatedInput("Test prompt", str -> str.matches("\\d+"));
        Assert.assertEquals(expected, actual);
    }

}
