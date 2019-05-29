package com.mcl.utilities;

import java.util.Map;

public class UrlStringBuilder {

    private Map<String, String> parameters;
    private String base;
    private String urlString;

    public UrlStringBuilder(String base, Map<String,String> parameters) {
        this.base = base;
        this.parameters = parameters;
        buildUrlString();
    }

    public String getUrlString() {
        return urlString;
    }

    private void buildUrlString() {
        String parameterString = new ApiParameterStringBuilder(parameters).buildEncodedString();
        urlString = base + "?" + parameterString;
    }

}
