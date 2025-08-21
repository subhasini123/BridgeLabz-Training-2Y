import java.util.Scanner;

public class StudentFeeCalculator {
    public static void main(String[] args) {
        double fee, discountPercent, discount, finalFee;

        Scanner input = new Scanner(System.in);

        // Taking user input for fee
        System.out.print("Enter the course fee (INR): ");
        fee = input.nextDouble();

        // Taking user input for discount percentage
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();

        // Calculating discount and final fee
        discount = (fee * discountPercent) / 100;
        finalFee = fee - discount;

        // Displaying output
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
