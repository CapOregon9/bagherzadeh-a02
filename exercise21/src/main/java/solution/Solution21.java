/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

public class Solution21 {
    //Prompt user for month integer between 1 and 12
    //determine month using switch statement
    //output result
    public static void main(String[] args) {
        Month mth = new Month();
        mth.setMonth();
        System.out.println(mth);
    }
}
