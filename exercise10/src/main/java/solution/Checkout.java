package solution;

public class Checkout {
    private double subtotal;
    private static final double taxRate = 0.055;
    private double taxAmount;
    private double totalAmount;

    public void setSubtotal(double item, int quantity) {
        subtotal += (item * quantity);
    }

    public void getSubtotal() {
        System.out.printf("Subtotal: $%.2f%n", subtotal);
    }

    public void setTaxRate() {
        taxAmount = subtotal * taxRate;
    }

    public void getTaxRate() {
        System.out.printf("Tax: $%.2f%n", taxAmount);
    }

    public void setTotalAmount() {
        totalAmount = subtotal + taxAmount;
    }

    public void getTotalAmount() {
        System.out.printf("Total: $%.2f%n", totalAmount);
    }
}
