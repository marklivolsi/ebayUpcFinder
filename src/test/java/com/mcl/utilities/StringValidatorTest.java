package com.mcl.utilities;

import org.junit.Assert;
import org.junit.Test;

public class StringValidatorTest {

    @Test
    public void testValidateReturnsTrueForValidInput() {
        String input = "1234";
        Assert.assertTrue(new StringValidator(input)
                              .validate(str -> str.matches("\\d+")));
    }

    @Test
    public void testValidateReturnsFalseForInvalidInput() {
        String input = "123a";
        Assert.assertFalse(new StringValidator(input)
                               .validate(str -> str.matches("\\d+")));
    }

}
