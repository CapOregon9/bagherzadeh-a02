/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

public class Solution18 {
    //Take option from user
    //Enter appropriate temp
    //Convert
    //Output converted temp
    public static void main(String[] args) {
        Convert ct = new Convert();
        ct.setChoice();
        ct.setTemp();
        System.out.println(ct);
    }
}
