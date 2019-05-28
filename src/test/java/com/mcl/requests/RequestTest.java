package com.mcl.requests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;

public class RequestTest {

    private URL testUrl;
    private Request testRequest;

    @Before
    public void setTestUrl() {
        try {
            testUrl = new URL("https://jsonplaceholder.typicode.com/todos/1");
        }
        catch (Exception e) {}
    }

    @Test
    public void testRequestReturnsNotNullResponseObject() {
        try {
            Response resp = testRequest.call();
            Assert.assertNotNull(resp);
        }
        catch (Exception e) {}
    }

}
