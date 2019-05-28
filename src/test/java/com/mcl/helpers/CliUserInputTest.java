package com.mcl.helpers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.io.ByteArrayInputStream;

public class CliUserInputTest {

    @Before
    public void setSystemInputToString() {
        System.setIn(new ByteArrayInputStream("883929032273".getBytes()));
    }

    @Test
    public void testGetInputReturnsCorrectValue() {
        String input = new CliUserInput().getInput();
        Assert.assertEquals("883929032273", input);
    }

    @Test
    public void testGetValidInputReturnsValidInput() {
        String input = new CliUserInput().getValidInput(str -> str.matches("\\d+"));
        Assert.assertEquals("883929032273", input);
    }

    @Test(expected = java.util.NoSuchElementException.class)
    public void testGetValidInputRejectsInvalidInput() {
        System.setIn(new ByteArrayInputStream("8839290322AB".getBytes()));
        String input = new CliUserInput().getValidInput(str -> str.matches("\\d+"));
    }

    @After
    public void revertSystemInput() {
        System.setIn(System.in);
    }

}
