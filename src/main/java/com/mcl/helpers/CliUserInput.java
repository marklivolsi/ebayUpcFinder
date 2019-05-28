package com.mcl.helpers;

import java.util.Scanner;
import java.util.function.Predicate;

public class CliUserInput {

    private final Scanner scanner;
    private String value;
    private String prompt;

    public CliUserInput() {
        scanner = new Scanner(System.in);
    }

    public CliUserInput(String prompt) {
        scanner = new Scanner(System.in);
        this.prompt = prompt;
    }

    public String getValidInput(Predicate<String> tester) {
        do {
            getInput();
        } while (!tester.test(value));
        return value;
    }

    public String getInput() {
        if (prompt != null) {
            System.out.println(prompt);
        }
        value = scanner.nextLine();
        return value;
    }

    public String getValue() {
        return value;
    }
}
