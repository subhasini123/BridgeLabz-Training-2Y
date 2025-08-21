import java.util.Scanner;

public class PurchaseCalculator {
    public static void main(String[] args) {
        double unitPrice, totalPrice;
        int quantity;

        Scanner input = new Scanner(System.in);

        // Get unit price from user
        System.out.print("Enter the unit price of the item (INR): ");
        unitPrice = input.nextDouble();

        // Get quantity from user
        System.out.print("Enter the quantity to be bought: ");
        quantity = input.nextInt();

        // Calculate total price
        totalPrice = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity " + quantity + 
                           " and unit price is INR " + unitPrice);

        input.close();
    }
}

