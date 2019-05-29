package com.mcl.requests;

import com.mcl.config.Configuration;
import com.mcl.utilities.StringUtils;
import com.mcl.utilities.UrlStringBuilder;
import com.mcl.utilities.XmlPropertyReader;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RequestBuilderTest {

    private String findingApiResourcePath;
    private String baseUrl;
    private Map<String, String> parameters = new HashMap<>();

    @Before
    public void setTestFields() {
        findingApiResourcePath = Configuration.FINDING_API_RESOURCE_PATH.get();
        baseUrl = "http://svcs.ebay.com/services/search/FindingService/v1";
        parameters.put("keywords", "883929032273");
        parameters.put("OPERATION-NAME", "findCompletedItems");
        parameters.put("SERVICE-VERSION", "1.13.0");
    }

    // TODO: RequestBuilder tests
}
