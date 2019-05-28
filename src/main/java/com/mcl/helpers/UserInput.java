package com.mcl.helpers;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInput {

    private Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        return scanner.nextLine();
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
