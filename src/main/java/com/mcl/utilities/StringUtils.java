package com.mcl.utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class StringUtils {

//    private String string;

//    public StringUtils(String string) {
//        this.string = string;
//    }

    public ArrayList<String> removeInvalidStringsFromArray(ArrayList<String> strings, Predicate<String> tester) {
        ArrayList<String> results = new ArrayList<>();
        for (String string : strings) {
            if (validate(string, tester)) {
                results.add(string);
            }
        }
        return results;
    }

    public boolean validate(String string, Predicate<String> tester) {
        return tester.test(string);
    }

    public String sortString(String string) {
        char[] chars = string.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
