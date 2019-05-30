package com.mcl.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.mcl.requests.Response;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ResponseDeserializerTest {

    private String sampleJson = "{\n" +
            "  \"userId\": 1,\n" +
            "  \"id\": 1,\n" +
            "  \"title\": \"delectus aut autem\",\n" +
            "  \"completed\": false\n" +
            "}";

    @Test
    public void testResponseDeserializerCorrectlyMapsValues() throws IOException {
        Response response = new Response(new ByteArrayInputStream(sampleJson.getBytes()));
        ResponseDeserializer deserializer = new ResponseDeserializer();
        TestJsonObj testObj = (TestJsonObj) deserializer.deserialize(response, TestJsonObj.class);
        Assert.assertEquals("1", testObj.userId);
        Assert.assertEquals("1", testObj.id);
        Assert.assertEquals("delectus aut autem", testObj.title);
        Assert.assertEquals("false", testObj.completed);
    }

}
