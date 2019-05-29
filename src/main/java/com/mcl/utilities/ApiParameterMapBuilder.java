package com.mcl.utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ApiParameterMapBuilder {

    private ArrayList<String> parameterList;
    private Map<String, String> map = new HashMap<>();
    private String resourcePath;

    public ApiParameterMapBuilder(ArrayList<String> parameterList, String resourcePath) {
        this.parameterList = parameterList;
        this.resourcePath = resourcePath;
    }

    public Map<String, String> getMap() throws IOException {
        for (String parameter : parameterList) {
            String value = new XmlPropertyReader(resourcePath).getProperty(parameter);
            map.put(parameter, value);
        }
        return map;
    }

}
