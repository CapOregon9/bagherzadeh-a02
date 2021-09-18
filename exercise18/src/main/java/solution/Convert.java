/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.util.Scanner;

public class Convert {
    private double temp;
    private String convertState;
    private static final Scanner in = new Scanner(System.in);

    public void setChoice() {
        System.out.printf("Press C to convert from Fahrenheit to Celsius.%nPress F to convert from Celsius to Fahrenheit.%nYour choice: ");
        convertState = in.nextLine();
    }

    public void setTemp() {
        if (convertState.equals("C") || convertState.equals("c")) {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            temp = in.nextDouble();
        }
        else if (convertState.equals("F") || convertState.equals("f")) {
            System.out.println("Please enter the temperature in Celsius: ");
            temp = in.nextDouble();
        }
        else {
            System.out.println("You entered an incorrect choice.");
        }
    }

    public String convertTemp() {
        if (convertState.equals("C") || convertState.equals("c")) {
            temp = (temp - 32) * 5 / 9;
            return String.format("The temperature in Celsius is %.0f", temp);
        }
        else if (convertState.equals("F") || convertState.equals("f")) {
            temp = (temp * 9 / 5) + 32;
            return String.format("The temperature in Fahrenheit is %.0f", temp);
        }
        return "You entered an incorrect choice.";
    }

    @Override
    public String toString() {
        return convertTemp();
    }
}
