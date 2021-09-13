/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.util.Scanner;

public class Solution15 {
    //prompt user for password
    //compare with stored password
    //output comparison result
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the password?");
        String userInput = input.nextLine();
        PasswordChecker pS = new PasswordChecker(userInput);
        pS.checkPassword();
    }
}
