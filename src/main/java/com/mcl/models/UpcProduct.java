package com.mcl.models;

import com.mcl.utilities.StringUtils;

public class UpcProduct {

    private final String upc;

    public UpcProduct(String upc) {
        this.upc = upc;
    }

    public String getUpc() {
        return upc;
    }
}
