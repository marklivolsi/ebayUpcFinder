package com.mcl;

import com.mcl.utilities.DefaultParameterMapBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class App {

    public static void main(String[] args) throws IOException {
        Map<String, String> params = new DefaultParameterMapBuilder().getDefaultShoppingApiParameterMap();
        System.out.println(params);
    }

}
