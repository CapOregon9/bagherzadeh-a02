/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

public class Room {
    private int length;
    private int width;
    private int area;
    private static final double convertToMeters = 0.09290304;

    public Room(int length, int width) {
        this.length = length;
        this.width = width;
        this.area = length * width;
    }

    public void getDimensions() {
        System.out.printf("You entered dimensions of %d feet by %d feet.%n", length, width);
    }

    public void getArea() {
        System.out.printf("The area is %n%d square feet", area);
    }

    public void getAreaInMeters() {
        double areaInMeters = area * convertToMeters;
        System.out.printf("%n%.3f square meters", areaInMeters);
    }
}
