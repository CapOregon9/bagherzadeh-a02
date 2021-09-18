/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.util.Scanner;

public class Legality {
    private int age;
    private static final int LEGAL_AGE = 16;
    private static final Scanner in = new Scanner(System.in);

    public void setAge() {
        System.out.println("What is your age?");
        this.age = in.nextInt();
    }

    public String checkLegality() {
        return (age >= LEGAL_AGE) ? "You are old enough to legally drive." : "You are not old enough to legally drive.";
    }

    @Override
    public String toString() {
        return checkLegality();
    }
}
