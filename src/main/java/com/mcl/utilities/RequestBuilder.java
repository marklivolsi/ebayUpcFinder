package com.mcl.utilities;

import com.mcl.requests.Request;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class RequestBuilder {

    private String baseUrl;
    private Map<String, String> parameterMap;

    public RequestBuilder(String baseUrl, Map<String, String> parameterMap) {
        this.baseUrl = baseUrl;
        this.parameterMap = parameterMap;
    }

    public Request build() throws MalformedURLException {
        String url = new UrlStringBuilder(baseUrl, parameterMap).getUrlString();
        return new Request(new URL(url));
    }

    public void addParameter(String parameterName, String value) {
        parameterMap.put(parameterName, value);
    }

    public Map<String, String> getParameterMap() {
        return parameterMap;
    }
}
