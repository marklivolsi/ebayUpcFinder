package com.mcl.helpers;

import org.junit.Assert;
import org.junit.Test;

public class StringValidatorTest {

    @Test
    public void testValidateReturnsTrueForValidInput() {
        String input = "883929032273";
        Assert.assertTrue(new StringValidator(input)
                              .validate(str -> str.matches("\\d+")));
    }

    @Test
    public void testValidateReturnsFalseForInvalidInput() {
        String input = "88392903227A";
        Assert.assertFalse(new StringValidator(input)
                               .validate(str -> str.matches("\\d+")));
    }

}
