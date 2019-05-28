package com.mcl.utilities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ApiParameterStringBuilderTest {

    private Map<String, String> testParameters = new HashMap<>();

    @Before
    public void setTestParameters() {
        testParameters.put("key 1", "val1");
        testParameters.put("key$2", "val2");
        testParameters.put("key3", "val^3");
    }

    @Test
    public void testBuildReturnsProperlyFormattedString() {
        String expected = "key+1=val1&key%242=val2&key3=val%5E3";
        ApiParameterStringBuilder builder = new ApiParameterStringBuilder(testParameters);
        String formattedParameters = builder.buildEncodedString();
        String expectedSort = sortString(expected);
        String actualSort = sortString(formattedParameters);
        Assert.assertEquals(expectedSort, actualSort);
    }

    private String sortString(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
