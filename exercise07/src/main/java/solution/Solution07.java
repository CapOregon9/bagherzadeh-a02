/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.util.Scanner;

public class Solution07 {
    //Get input from user
    //print dimensions
    //calculate area in feet and display
    //convert to meters and display
    public static void main(String[] args) {
        System.out.println("What is the length of the room in feet?");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        System.out.println("What is the width of the room in feet?");
        int width = input.nextInt();
        Room r1 = new Room(length, width);
        r1.getDimensions();
        r1.getArea();
        r1.getAreaInMeters();
    }
}
