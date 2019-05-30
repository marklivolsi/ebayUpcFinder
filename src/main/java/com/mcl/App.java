package com.mcl;

import com.mcl.config.PropertyKeys;
import com.mcl.requests.Request;
import com.mcl.utilities.DefaultParameterMapBuilder;
import com.mcl.utilities.RequestBuilder;
import com.mcl.utilities.UrlStringBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class App {

    public static void main(String[] args) throws IOException {
        Map<String, String> params = new DefaultParameterMapBuilder().getDefaultShoppingApiParameterMap();
        System.out.println(params);
        String baseUrl = PropertyKeys.FIND_API_BASE_URL.getValue();
        System.out.println(baseUrl);
        String url = new UrlStringBuilder(baseUrl, params).getUrlString();
        System.out.println(url);
        Request req = new RequestBuilder(baseUrl, params).buildRequest();
        System.out.println(req);
    }

}
