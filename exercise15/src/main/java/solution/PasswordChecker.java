/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

public class PasswordChecker {
    private String userInput;
    private static final String PASSWORD = "abc$123";

    public PasswordChecker(String userInput) {
        this.userInput = userInput;
    }

    public void checkPassword() {
        if (userInput.equals(PASSWORD)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}
