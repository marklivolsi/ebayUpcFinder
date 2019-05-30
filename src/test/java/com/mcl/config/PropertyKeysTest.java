package com.mcl.config;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class PropertyKeysTest {

    @Test
    public void testPropertyKeysReturnsCorrectKey() {
        String expectedKey = "IncludeSelector";
        String actualKey = PropertyKeys.SHOP_API_INCLUDE_SELECTOR.getKey();
        Assert.assertEquals(expectedKey, actualKey);
    }

    @Test
    public void testPropertyKeysReturnsCorrectValue() throws IOException {
        String expectedValue = "Description,ItemSpecifics";
        String actualValue = PropertyKeys.SHOP_API_INCLUDE_SELECTOR.getValue();
        Assert.assertEquals(expectedValue, actualValue);
    }
}

