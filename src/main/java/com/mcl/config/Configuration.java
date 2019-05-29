package com.mcl.config;

import java.io.File;

public enum Configuration {

    FINDING_API_RESOURCE_PATH ("src/main/resources/FindingApiParameters.xml"),
    SHOPPING_API_RESOURCE_PATH ("src/main/resources/ShoppingApiParameters.xml");

    private final String key;

    Configuration(String key) {
        this.key = key;
    }

    public boolean resourceFileExists() {
        String path = get();
        File file = new File(path);
        return file.exists();
    }

    public String get() {
        return key;
    }

}
