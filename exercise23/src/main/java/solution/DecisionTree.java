/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.util.Scanner;

public class DecisionTree {
    private String decision;
    private static final Scanner in = new Scanner(System.in);
    private String incorrectInput = "Incorrect input. Enter y or n.";

    public String decision() {
        System.out.println("Is the car silent when you turn the key?");
        decision = in.nextLine();
        if (decision.equals("y") || decision.equals("Y")) {
            return batteryDecision();
        }
        else if (decision.equals("n") || decision.equals("N")) {
            return noiseDecision();
        }
        else {
            return incorrectInput;
        }
    }

    private String noiseDecision() {
        System.out.println("Does the car make a slicking noise?");
        decision = in.nextLine();
        if (decision.equals("y") || decision.equals("Y")) {
            return "Replace the battery.";
        }
        else if (decision.equals("n") || decision.equals("N")) {
            return crankDecision();
        }
        else {
            return incorrectInput;
        }
    }

    private String crankDecision() {
        System.out.println("Does the car crank up but fail to start?");
        decision = in.nextLine();
        if (decision.equals("y") || decision.equals("Y")) {
            return "Check spark plug connections.";
        }
        else if (decision.equals("n") || decision.equals("N")) {
            return engineDecision();
        }
        else {
            return incorrectInput;
        }
    }

    private String engineDecision() {
        System.out.println("Does the engine start and then die?");
        decision = in.nextLine();
        if (decision.equals("y") || decision.equals("Y")) {
            return fuelDecision();
        }
        else if (decision.equals("n") || decision.equals("N")) {
            return "This should not be possible.";
        }
        else {
            return incorrectInput;
        }
    }

    private String fuelDecision() {
        System.out.println("Does your car have fuel injection?");
        decision = in.nextLine();
        if (decision.equals("y") || decision.equals("Y")) {
            return "Get it in for service.";
        }
        else if (decision.equals("n") || decision.equals("N")) {
            return "Check to ensure the choke is opening and closing.";
        }
        else {
            return incorrectInput;
        }
    }

    private String batteryDecision() {
        System.out.println("Are the battery terminals corroded?");
        decision = in.nextLine();
        if (decision.equals("y") || decision.equals("Y")) {
            return "Clean terminals and try starting again.";
        }
        else if (decision.equals("n") || decision.equals("N")) {
            return "Replace cables and try again.";
        }
        else {
            return incorrectInput;
        }
    }

    @Override
    public String toString() {
        return String.format("%s", decision());
    }
}
