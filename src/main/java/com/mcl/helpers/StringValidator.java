package com.mcl.helpers;

import java.util.function.Predicate;

public class StringValidator {

    private String string;

    public StringValidator(String string) {
        this.string = string;
    }

    public boolean validate(Predicate<String> tester) {
        return tester.test(string);
    }

}
