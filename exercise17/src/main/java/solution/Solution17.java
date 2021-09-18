/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

public class Solution17 {
    //Ask user for gender
    //Prompt user for amount of alcohol
    //Ask user for weight
    //Ask user for how many hours since last drink
    //Check inputs with try catch
    //Output BAC and if its legal to drive
    public static void main(String[] args) {
        Legality lg = new Legality();
        lg.setGender();
        lg.setAmountOfAlcohol();
        lg.setWeight();
        lg.setHoursSinceDrinking();
        System.out.println(lg);
    }
}
