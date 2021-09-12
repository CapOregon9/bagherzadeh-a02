package solutions;

import java.util.Scanner;

public class Solution06 {
    //Get input from user
    //store into variables
    //send data to person class
    //calculate time remaining until retirement
    public static void main(String[] args) {
        System.out.println("What is your current age?");
        Scanner input = new Scanner(System.in);
        String currentAge = input.nextLine();
        System.out.println("At what age would you like to retire?");
        String retireAge = input.nextLine();
        Person p1 = new Person(Integer.parseInt(currentAge),Integer.parseInt(retireAge));
        p1.retirementTime();
    }
}
