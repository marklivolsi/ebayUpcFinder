package com.mcl;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class App {

    public static void main(String[] args) {
        System.out.println(URLEncoder.encode("key^1", StandardCharsets.UTF_8));
    }

}
