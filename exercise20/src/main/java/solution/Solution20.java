/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

public class Solution20 {
    //Prompt for order amount
    //Prompt for state
    //check state for tax amount
    //If wisconsin, prompt for county
    public static void main(String[] args) {
        MultiStateTax ms = new MultiStateTax();
        ms.setAmount();
        ms.setState();
        System.out.println(ms);
    }
}
