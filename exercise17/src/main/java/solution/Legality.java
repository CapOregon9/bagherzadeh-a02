/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.util.Scanner;

public class Legality {
    private int gender;
    private double amountOfAlcohol;
    private double weight;
    private int hoursSinceDrinking;
    private double bacLevel;
    private static final double bac = 0.08;
    private static final Scanner in = new Scanner(System.in);

    public void setGender() {
        System.out.println("Enter a 1 if you are male or a 2 if you are female: ");
        String input = in.nextLine();
        try {
            gender = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println(input + " is a non-numeric value.");
        }
    }

    public void setAmountOfAlcohol() {
        System.out.println("How many ounces of alcohol did you have? ");
        String input = in.nextLine();
        try {
            amountOfAlcohol = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println(input + " is a non-numeric value.");
        }
    }

    public void setWeight() {
        System.out.println("What is your weight, in pounds? ");
        String input = in.nextLine();
        try {
            weight = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println(input + " is a non-numeric value.");
        }
    }

    public void setHoursSinceDrinking() {
        System.out.println("How many hours has it been since your last drink? ");
        String input = in.nextLine();
        try {
            hoursSinceDrinking = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println(input + " is a non-numeric value.");
        }
    }

    public String setBacLevel() {
        if (gender == 1) {
            bacLevel = (amountOfAlcohol * (5.14 / weight) * 0.73) - (0.015 * hoursSinceDrinking);
            return String.format("Your BAC is %.6f", bacLevel);
        }
        else if (gender == 2) {
            bacLevel = (amountOfAlcohol * (5.14 / weight) * 0.66) - (0.015 * hoursSinceDrinking);
            return String.format("Your BAC is %.6f", bacLevel);
        }
        else {
            return "Wrong input for gender.";
        }
    }

    public String checkLegality() {
        return (bacLevel >= bac) ? "It is not legal for you to drive." : "It is legal for you to drive.";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(setBacLevel()).append(System.getProperty("line.separator")).append(checkLegality());
        return sb.toString();
    }
}
