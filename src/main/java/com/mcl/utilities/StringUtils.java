package com.mcl.utilities;

import java.util.Arrays;
import java.util.function.Predicate;

public class StringUtils {

    private String string;

    public StringUtils(String string) {
        this.string = string;
    }

    public boolean validate(Predicate<String> tester) {
        return tester.test(string);
    }

    public String sortString() {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
