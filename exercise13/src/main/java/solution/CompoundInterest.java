/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.text.NumberFormat;

public class CompoundInterest {
    private double principal;
    private double rate;
    private int time;
    private int timesPerYear;

    public CompoundInterest(double principal, double rate, int time, int timesPerYear) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.timesPerYear = timesPerYear;
    }

    public void getCompoundInterest() {
        NumberFormat nF = NumberFormat.getCurrencyInstance();
        double result = principal * Math.pow((1 + ((rate / 100) / timesPerYear)), (timesPerYear * time));
        System.out.printf("%s invested at %.1f%% for %d years compounded %d times per year is %s.", nF.format(principal), rate, time, timesPerYear, nF.format(result));
    }
}
