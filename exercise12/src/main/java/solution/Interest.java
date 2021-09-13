/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.text.NumberFormat;

public class Interest {
    private double principle;
    private double rate;
    private int time;

    public Interest(double principle, double rate, int time) {
        this.principle = principle;
        this.rate = rate;
        this.time = time;
    }

    public void getInterest() {
        var numberFormat = NumberFormat.getCurrencyInstance();
        double result = principle * (1 + ((rate / 100) * time));
        System.out.printf("After %d years at %.1f%%, the investment will be worth %s", time, rate, numberFormat.format(result));

    }
}
