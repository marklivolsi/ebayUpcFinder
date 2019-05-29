package com.mcl.config;

public enum Configuration {

    FINDING_API_RESOURCE_PATH ("src/main/resources/FindingApiParameters.xml");

    private final String key;

    Configuration(String key) {
        this.key = key;
    }

    public String get() {
        return key;
    }

}
