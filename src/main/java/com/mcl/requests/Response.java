package com.mcl.requests;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Response {

    private InputStream body;

    public Response(InputStream body) {
        this.body = body;
    }

    public String getBodyAsString() throws IOException {
        return new String(body.readAllBytes(), StandardCharsets.UTF_8);
    }

}
