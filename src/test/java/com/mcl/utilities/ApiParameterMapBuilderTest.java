package com.mcl.utilities;

import com.mcl.config.PropertyKeys;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ApiParameterMapBuilderTest {

    private ArrayList<String> parameterList = new ArrayList<>();
    private String resourcePath = "src/main/resources/Parameters.xml";
    private Map<String, String> expectedMap = new HashMap<>();

    @Before
    public void setParameters() {
        parameterList.add("OPERATION-NAME");
        parameterList.add("SERVICE-VERSION");
        parameterList.add("GLOBAL-ID");
        expectedMap.put("OPERATION-NAME", "findCompletedItems");
        expectedMap.put("SERVICE-VERSION", "1.13.0");
        expectedMap.put("GLOBAL-ID", "EBAY-US");
    }

    @Test
    public void testGetMapReturnsCorrectMap() throws IOException {
        Map<String, String> actualMap = new ApiParameterMapBuilder(parameterList, resourcePath).getMap();
        Assert.assertEquals(expectedMap, actualMap);
    }

}
