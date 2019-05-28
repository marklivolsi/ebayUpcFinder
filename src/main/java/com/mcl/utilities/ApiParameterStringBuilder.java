package com.mcl.utilities;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class ApiParameterStringBuilder {

    private Map<String, String> parameters;

    public ApiParameterStringBuilder(Map<String, String> parameters) {
        this.parameters = parameters;
    }

    public String buildEncodedString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> parameter : parameters.entrySet()) {
            result.append(URLEncoder.encode(parameter.getKey(), StandardCharsets.UTF_8));
            result.append("=");
            result.append(URLEncoder.encode(parameter.getValue(), StandardCharsets.UTF_8));
            result.append("&");
        }
        String encodedString = result.toString();
        return encodedString.length() > 0 ? encodedString.substring(0, encodedString.length() - 1) : encodedString;
    }

}
