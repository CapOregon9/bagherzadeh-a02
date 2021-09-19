/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.util.Scanner;

public class Compare {
    private int num1;
    private int num2;
    private int num3;
    private static final Scanner in = new Scanner(System.in);

    public void setNum1() {
        System.out.println("Enter the first number: ");
        num1 = Integer.parseInt(in.nextLine());
    }

    public void setNum2() {
        System.out.println("Enter the second number: ");
        num2 = Integer.parseInt(in.nextLine());
    }

    public void setNum3() {
        System.out.println("Enter the third number: ");
        num3 = Integer.parseInt(in.nextLine());
    }

    public String compareNumbers() {
        String format = "The largest number is ";
        if (num1 != num2 && num1 != num3 && num2 != num3) {
            if (num1 > num2) {
                if  (num1 > num3) {
                    return String.format("%s%d.", format, num1);
                }
            }
            else if (num2 > num3) {
                return String.format("%s%d.", format, num2);
            }
            else {
                return String.format("%s%d.", format, num3);
            }
        }
        return "Invalid input. Please enter Three different numbers.";
    }

    @Override
    public String toString() {
        return String.format("%s", compareNumbers());
    }
}
