package com.mcl.utilities;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer {

    private ObjectMapper mapper;

    public Serializer() {
        mapper = new ObjectMapper();
    }

    public String serializeToJson(Object obj) throws JsonProcessingException {
        return mapper.writeValueAsString(obj);
    }

}

