/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

public class Solution22 {
    //Ask user for three numbers
    //Compare the three numbers
    //Output largest number if they are all different
    public static void main(String[] args) {
        Compare cm = new Compare();
        cm.setNum1();
        cm.setNum2();
        cm.setNum3();
        System.out.println(cm);
    }
}
