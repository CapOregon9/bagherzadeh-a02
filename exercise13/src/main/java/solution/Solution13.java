/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.util.Scanner;

public class Solution13 {
    //Prompt for principal, rate in %, time in years, and number of times compounded per year
    //calculate compound interest
    //output interest calculation in formatted string
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the principal amount?");
        String principal = input.nextLine();
        System.out.println("What is the rate?");
        String rate = input.nextLine();
        System.out.println("What is the number of years?");
        String time = input.nextLine();
        System.out.println("What is the number of times the interest is compounded per year?");
        String timesPerYear = input.nextLine();
        CompoundInterest compInt = new CompoundInterest(Double.parseDouble(principal), Double.parseDouble(rate), Integer.parseInt(time), Integer.parseInt(timesPerYear));
        compInt.getCompoundInterest();
    }
}
