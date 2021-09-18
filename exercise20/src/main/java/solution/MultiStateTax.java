/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.text.NumberFormat;

import java.util.Scanner;

public class MultiStateTax {
    private double amount;
    private String state;
    private double taxAmount;
    private static final Scanner in = new Scanner(System.in);
    private static final NumberFormat nf = NumberFormat.getCurrencyInstance();

    public void setAmount() {
        System.out.println("What is the order amount?");
        amount = Double.parseDouble(in.nextLine());
    }

    public void setState() {
        System.out.println("What state do you live in?");
        state = in.nextLine();
    }

    public String calcTaxAmount() {
        final String format = String.format("The tax is %s", nf.format(taxAmount));
        String county;
        if (state.equals("Wisconsin") || state.equals("wisconsin")) {
            System.out.println("What county do you live in?");
            county = in.nextLine();
            if (county.equals("Eau Claire") || county.equals("eau claire")) {
                taxAmount = amount * 0.055;
            }
            else if (county.equals("Dunn") || county.equals("dunn")) {
                taxAmount = amount * 0.054;
            }
            else {
                taxAmount = amount * 0.05;
            }
        }
        else if (state.equals("Illinois") || state.equals("illinois")) {
            taxAmount = amount * 0.08;
        }
        else {
            taxAmount = 0.0;
        }
        return format;
    }

    public String calcTotal() {
        double totalAmount;
        totalAmount = amount + taxAmount;
        return String.format("The total is %s", nf.format(totalAmount));
    }

    @Override
    public String toString() {
        return String.format("%s%n%s", calcTaxAmount(), calcTotal());
    }
}
