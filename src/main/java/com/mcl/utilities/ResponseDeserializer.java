package com.mcl.utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mcl.requests.Response;

import java.io.IOException;

public class ResponseDeserializer {

    private ObjectMapper objMapper = new ObjectMapper();

    public <T> T deserialize(Response response, Class<T> c) throws IOException {
        String responseBody = response.getBodyAsString();
        T obj = objMapper.readValue(responseBody, c);
        return obj;
    }

}
