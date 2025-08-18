import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Ask the user for the first number
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        // Ask the user for the second number
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Print the result
        System.out.println("The sum is: " + sum);

        // Close the scanner
        input.close();
    }
}

