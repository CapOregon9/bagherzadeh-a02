/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

public class Solution19 {
    //Prompt user for weight and height
    //check if its valid numeric data
    //calculate BMI
    //output results
    public static void main(String[] args) {
        BMI bmi = new BMI();
        bmi.setWeight();
        bmi.setHeight();
        System.out.println(bmi);
    }
}
