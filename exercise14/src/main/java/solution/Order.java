/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.text.NumberFormat;

public class Order {
    private double amount;
    private static final double RATE = 0.055;
    private double tax;
    private double output;

    public Order(double amount) {
        this.amount = amount;
        this.output = amount;
    }

    public void addTax() {
        tax = amount * RATE;
        output += tax;
    }

    public String getOrder() {
        NumberFormat nF = NumberFormat.getCurrencyInstance();
        if (tax != 0.0) {
            return String.format("The subtotal is %s.%nThe tax is %s.%nThe total is %s.", nF.format(amount), nF.format(tax), nF.format(output));
        }
        return String.format("The total is %s.", nF.format(output));
    }

    public void printOrder(String order) {
        System.out.println(order);
    }
}
