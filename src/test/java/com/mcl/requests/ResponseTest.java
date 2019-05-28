package com.mcl.requests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;

public class ResponseTest {

    private Response testResponse;

    @Before
    public void setTestResponse() {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/todos/1");
            Request testRequest = new Request(url);
            testResponse = testRequest.call();
        }
        catch (Exception e) {}
    }

    @Test
    public void testGetBodyAsStringDoesNotReturnNull() {
        try {
            String testString = testResponse.getBodyAsString();
            Assert.assertNotNull(testString);
        }
        catch (Exception e) {}
    }

}
