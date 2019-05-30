package com.mcl.config;

import com.mcl.utilities.XmlPropertyReader;

public enum PropertyKeys {

    FIND_API_APP_ID ("SECURITY-APPNAME"),
    FIND_API_BASE_URL ("FINDING_API_BASE_URL"),
    FIND_API_OPERATION ("OPERATION-NAME"),
    FIND_API_VERSION ("SERVICE-VERSION"),
    FIND_API_GLOBAL_ID ("GLOBAL-ID"),
    FIND_API_CATEGORY_ID ("categoryId"),
    FIND_API_RESPONSE_FORMAT ("RESPONSE-DATA-FORMAT"),

    SHOP_API_APP_ID ("appid"),
    SHOP_API_BASE_URL ("SHOPPING_API_BASE_URL"),
    SHOP_API_OPERATION ("callname"),
    SHOP_API_VERSION ("version"),
    SHOP_API_SITE_ID ("siteid"),
    SHOP_API_INCLUDE_SELECTOR ("IncludeSelector"),
    SHOP_API_RESPONSE_FORMAT ("responseencoding");

    private final String xmlResourcePath = "src/main/resources/Parameters.xml";
    private final String key;
    private final String value;

    PropertyKeys(String key) {
        this.key = key;
        this.value = new XmlPropertyReader(xmlResourcePath).getProperty(key);
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public String getXmlResourcePath() {
        return xmlResourcePath;
    }
}
