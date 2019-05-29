package com.mcl.utilities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class UrlStringBuilderTest {

    private Map<String, String> parameters = new HashMap<>();
    private String base;

    @Before
    public void setParameters() {
        parameters.put("key1","val1");
        parameters.put("key2","val2");
        base = "http://www.sampleurl.com/";
    }

    @Test
    public void testGetUrlStringReturnsCorrectString() {
        String expected = new StringUtils("http://www.sampleurl.com/?key1=val1&key2=val2").sortString();
        UrlStringBuilder builder = new UrlStringBuilder(base, parameters);
        String actual = new StringUtils(builder.getUrlString()).sortString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetUrlStringReturnsCorrectStringWithEmptyParameterMap() {
        String expected = new StringUtils("http://www.sampleurl.com/?").sortString();
        Map<String, String> emptyParameters = new HashMap<>();
        UrlStringBuilder builder = new UrlStringBuilder(base, emptyParameters);
        String actual = new StringUtils(builder.getUrlString()).sortString();
        Assert.assertEquals(expected, actual);
    }

}
