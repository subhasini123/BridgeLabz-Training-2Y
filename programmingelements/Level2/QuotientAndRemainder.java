import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number (number1): ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second number (number2): ");
        int number2 = scanner.nextInt();

        // Check for division by zero
        if (number2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            // Calculating quotient and remainder
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Displaying the result
            System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder +
                               " of two number " + number1 + " and " + number2);
        }

        scanner.close();
    }
}


           

