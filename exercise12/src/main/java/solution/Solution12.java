/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.util.Scanner;

public class Solution12 {
    //Prompt for principal, rate in %, and time in years
    //calculate interest
    //Output interest
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal:");
        String principal = input.nextLine();
        System.out.println("Enter the rate of interest:");
        String rate = input.nextLine();
        System.out.println("Enter the number of years:");
        String time = input.nextLine();
        Interest account = new Interest(Double.parseDouble(principal), Double.parseDouble(rate), Integer.parseInt(time));
        account.getInterest();
    }
}
