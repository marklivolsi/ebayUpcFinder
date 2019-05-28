package com.mcl.requests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.net.URL;

public class RequestTest {

    private Request testRequest;

    @Before
    public void setTestRequest() {
        try {
            URL testUrl = new URL("https://jsonplaceholder.typicode.com/todos/1");
            testRequest = new Request(testUrl);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRequestIsNotNull() {
        try {
            Assert.assertNotNull(testRequest);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
