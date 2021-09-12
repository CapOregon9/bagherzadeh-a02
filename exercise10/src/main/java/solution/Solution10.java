package solution;

import java.util.Scanner;

public class Solution10 {
    //Prompt info for items 1, 2, and 3;
    //Calculate Subtotal, tax, and total
    //output results
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Checkout cart = new Checkout();
        for (int i = 1; i < 4; i++) {
            System.out.println("Enter the price of item " + i + ":");
            String item = input.nextLine();
            System.out.println("Enter the quantity of item " + i + ":");
            String quantity = input.nextLine();
            cart.setSubtotal(Double.parseDouble(item), Integer.parseInt(quantity));
        }
        cart.getSubtotal();
        cart.setTaxRate();
        cart.getTaxRate();
        cart.setTotalAmount();
        cart.getTotalAmount();
    }
}
