package com.mcl.utilities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RequestBuilderTest {

    private String baseUrl;
    private Map<String, String> parameters = new HashMap<>();

    @Before
    public void setTestFields() {
        baseUrl = "http://svcs.ebay.com/services/search/FindingService/v1";
        parameters.put("keywords", "883929032273");
        parameters.put("OPERATION-NAME", "findCompletedItems");
        parameters.put("SERVICE-VERSION", "1.13.0");
    }

    // TODO: RequestBuilder tests

    @Test
    public void testAddParameterCorrectlyAddsNewParameterToMap() {
        Map<String, String> expected = parameters;
        expected.put("anotherParameter", "anotherValue");
        RequestBuilder builder = new RequestBuilder(baseUrl, parameters);
        builder.addParameter("anotherParameter", "anotherValue");
        Assert.assertEquals(expected, builder.getParameterMap());
    }
}
