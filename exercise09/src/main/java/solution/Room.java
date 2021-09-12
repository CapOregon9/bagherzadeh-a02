/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

public class Room {
    private double area;
    private static final double convertToGallons = 0.0028571429;

    public Room(double length, double width) {
        this.area = length * width;
    }

    public void getGallons() {
        double result = area * convertToGallons;
        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", Math.ceil(result), area);
    }
}
