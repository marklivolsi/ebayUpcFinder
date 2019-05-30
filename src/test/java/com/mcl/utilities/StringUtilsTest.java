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

    @Test
    public void testRemoveInvalidStringsFromArrayReturnsCorrectArray() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("1234", "9abc", "5678"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("1234", "5678"));
        ArrayList<String> actual = new StringUtils().removeInvalidStringsFromArray(input, str -> str.matches("\\d+"));
        Assert.assertEquals(expected, actual);
    }

}
