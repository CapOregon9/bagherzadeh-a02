/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.util.Scanner;

public class Month {
    private int monthInput;
    private static final Scanner in = new Scanner(System.in);

    public void setMonth() {
        do {
            try {
                System.out.println("Please enter the number of the month: ");
                monthInput = Integer.parseInt(in.nextLine());
                if (monthInput < 1 || monthInput > 12) {
                    System.out.println("Integer out of range. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("You entered non-numeric data. Try Again.");
            }
        } while (monthInput < 1 || monthInput > 12);
    }

    public String calcMonth() {
        switch (monthInput) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Incorrect month integer entered.";
        }
    }

    @Override
    public String toString() {
        return String.format("The name of the month is %s", calcMonth());
    }
}
