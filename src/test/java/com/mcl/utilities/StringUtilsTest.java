package com.mcl.utilities;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testValidateReturnsTrueForValidInput() {
        String input = "1234";
        Assert.assertTrue(new StringUtils(input)
                              .validate(str -> str.matches("\\d+")));
    }

    @Test
    public void testValidateReturnsFalseForInvalidInput() {
        String input = "123a";
        Assert.assertFalse(new StringUtils(input)
                               .validate(str -> str.matches("\\d+")));
    }

    @Test
    public void testSortReturnsProperlySortedString() {
        String input = "cba321";
        String sorted = new StringUtils(input).sortString();
        Assert.assertEquals("123abc", sorted);
    }

}
