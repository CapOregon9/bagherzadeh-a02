/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.util.Scanner;

public class BMI {
    private double height;
    private double weight;
    private double bmiValue;
    private static final Scanner in = new Scanner(System.in);

    public void setWeight() {
        boolean state = false;
        do {
            try {
                System.out.println("What is your weight?");
                weight = Double.parseDouble(in.nextLine());
                state = false;
            } catch (NumberFormatException e) {
                System.out.println("Input is non-numeric. Try again.");
                state = true;
            }
        } while (state);
    }

    public void setHeight() {
        boolean state = false;
        do {
            try {
                System.out.println("What is your height?");
                height = Double.parseDouble(in.nextLine());
                state = false;
            } catch (NumberFormatException e) {
                System.out.println("Input is non-numeric. Try again.");
                state = true;
            }
        } while (state);
    }

    public String calcBMI() {
        bmiValue = (weight / (Math.pow(height, 2)) * 703);
        return String.format("Your BMI is %.1f", bmiValue);
    }

    public String calcWeightState() {
        return (bmiValue <= 25 && bmiValue >= 18.5) ? "You are within the ideal weight range." : "You are overweight. You should see your doctor.";
    }

    @Override
    public String toString() {
        return String.format("%s%n%s", calcBMI(), calcWeightState());
    }
}
