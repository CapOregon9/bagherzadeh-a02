/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.util.Scanner;

public class Solution11 {
    //Prompt for euro amount
    //Prompt for exchange rate
    //Convert to USD and round to nearest penny
    public static void main(String[] args) {
        System.out.println("How many euros are you exchanging?");
        Scanner input = new Scanner(System.in);
        String euros = input.nextLine();
        System.out.println("What is the exchange rate?");
        String rate = input.nextLine();
        Exchange dollar = new Exchange(Double.parseDouble(euros), Double.parseDouble(rate));
        dollar.convertToOther();
    }
}
