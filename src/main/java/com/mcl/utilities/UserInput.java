package com.mcl.utilities;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class UserInput {

    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public String getValidatedInput(String prompt, Predicate<String> tester) {
        String input;
        boolean valid;
        do {
            input = getInput(prompt);
            valid = new StringUtils().validate(input, tester);
        } while (!valid);
        return input;
    }

    public String getInput() {
        return scanner.nextLine();
    }

    public String getInput(String prompt) {
        System.out.println(prompt);
        return getInput();
    }

    public ArrayList<String> getMultiLineInput() {
        ArrayList<String> tokens = new ArrayList<>();
        while (scanner.hasNext()) {
            String s = scanner.next();
            tokens.add(s);
        }
        return tokens;
    }

}
