/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.text.DecimalFormat;

public class Exchange {
    private double amount;
    private double rate;

    public Exchange(double amount, double rate) {
        this.amount = amount;
        this.rate = rate;
    }

    public void convertToOther() {
        double output = amount * rate;
        DecimalFormat df = new DecimalFormat("0.00");
        String format = df.format(output);
        System.out.printf("%.2f euros at an exchange rate of %.4f is %s U.S. dollars.", amount, rate, format);
    }
}
