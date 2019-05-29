package com.mcl.config;

import org.junit.Assert;
import org.junit.Test;

public class ConfigurationTest {

    @Test
    public void testGetReturnsCorrectString() {
        String expected = "src/main/resources/FindingApiParameters.xml";
        String actual = Configuration.FINDING_API_RESOURCE_PATH.get();
        Assert.assertEquals(expected, actual);
    }

}
