package com.mcl.utilities;

import java.util.Arrays;
import java.util.function.Predicate;

public class StringUtils {

    public boolean validate(String string, Predicate<String> tester) {
        return tester.test(string);
    }

    public String sortString(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
