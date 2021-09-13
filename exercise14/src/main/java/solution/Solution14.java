/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Alexander Bagherzadeh
 */

package solution;

import java.util.Scanner;

public class Solution14 {
    //prompt user for order amount and state
    //if state is WI, then output subtotal, tax, and total
    //if state is not WI, then output total
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the order amount?");
        String amount = input.nextLine();
        System.out.println("What is the state?");
        String state = input.nextLine();
        Order order = new Order(Double.parseDouble(amount));
        if (state.equals("WI")) {
            order.addTax();
        }
        order.printOrder(order.getOrder());
    }
}
