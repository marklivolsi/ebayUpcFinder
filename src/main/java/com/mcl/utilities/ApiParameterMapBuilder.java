package com.mcl.utilities;

import com.mcl.config.PropertyKeys;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ApiParameterMapBuilder {

    private Map<String, String> defaultFindingApiParameterMap = new HashMap<>();
    private Map<String, String> defaultShoppingApiParameterMap = new HashMap<>();

    public ApiParameterMapBuilder() throws IOException {
        buildDefaultParameterMaps();
    }

    public void buildDefaultParameterMaps() throws IOException {
        for (PropertyKeys propertyKey : PropertyKeys.values()) {
            String name = propertyKey.name();
            String key = propertyKey.getKey();
            String value = propertyKey.getValue();
            if (!name.contains("BASE_URL")) {
                if (name.contains("FIND")) {
                    defaultFindingApiParameterMap.put(key, value);
                }
                else if (name.contains("SHOP")) {
                    defaultShoppingApiParameterMap.put(key, value);
                }
            }
        }
    }

    public Map<String, String> getDefaultFindingApiParameterMap() {
        return defaultFindingApiParameterMap;
    }

    public Map<String, String> getDefaultShoppingApiParameterMap() {
        return defaultShoppingApiParameterMap;
    }
}
