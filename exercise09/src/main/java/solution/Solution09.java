package solution;

import java.util.Scanner;

public class Solution09 {
    //Prompt user for length and width
    //Get input and calculate area of room
    //calculate raw gallons needed
    //print gallons needed rounded up.
    public static void main(String[] args) {
        System.out.println("What is the length of the room?");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("What is the width of the room?");
        double width = input.nextDouble();
        Room room = new Room(length, width);
        room.getGallons();
    }
}
