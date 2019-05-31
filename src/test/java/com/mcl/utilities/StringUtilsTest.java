package com.mcl.utilities;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StringUtilsTest {

    @Test
    public void testValidateReturnsTrueForValidInput() {
        String input = "1234";
        Assert.assertTrue(new StringUtils()
                              .validate(input, str -> str.matches("\\d+")));
    }

    @Test
    public void testValidateReturnsFalseForInvalidInput() {
        String input = "123a";
        Assert.assertFalse(new StringUtils()
                               .validate(input, str -> str.matches("\\d+")));
    }

    @Test
    public void testSortReturnsProperlySortedString() {
        String input = "cba321";
        String sorted = new StringUtils().sortString(input);
        Assert.assertEquals("123abc", sorted);
    }

}
