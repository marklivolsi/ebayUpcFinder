package com.mcl.utilities;

import com.mcl.requests.Request;
import com.mcl.utilities.UrlStringBuilder;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

public class RequestBuilder {

    private String base;
    private Map<String, String> parameters;

    public RequestBuilder(String base, Map<String, String> parameters) {
        this.base = base;
        this.parameters = parameters;
    }

    public Request build() throws MalformedURLException {
        String url = new UrlStringBuilder(base, parameters).getUrlString();
        return new Request(new URL(url));
    }

}
