package solution;

import java.util.Scanner;

public class Solution08 {
    //Get input from user for people, pizzas, and slices
    //Calculate amount of slices
    //Calculate slices per person
    //Calculate leftover pizzas
    public static void main(String[] args) {
        System.out.println("How many people?");
        Scanner input = new Scanner(System.in);
        int people = input.nextInt();
        System.out.println("How many pizzas do you have?");
        int pizzas = input.nextInt();
        System.out.println("How many slices per pizza?");
        int slices = input.nextInt();
        Party party = new Party(people, pizzas, slices);
        party.getTotalSlices();;
        party.getSlicesPerPerson();
        party.getLeftovers();
    }
}
