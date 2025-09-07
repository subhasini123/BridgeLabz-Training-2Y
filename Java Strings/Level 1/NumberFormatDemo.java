// Filename: NumberFormatDemo.java

import java.util.Scanner;

public class NumberFormatDemo {

    // Method that generates the exception without handling
    public static void generateException(String input) {
        System.out.println("Generating NumberFormatException...");
        int number = Integer.parseInt(input); // will crash if input is not a number
        System.out.println("Converted Number: " + number);
    }

    // Method that demonstrates handling the exception
    public static void handleException(String input) {
        try {
            System.out.println("Handling NumberFormatException...");
            int number = Integer.parseInt(input); // may throw exception
            System.out.println("Converted Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // First call (will cause abrupt termination if input is not a number)
        // Uncomment below line to see program crash:
        // generateException(str);

        // Second call (handled properly with try-catch)
        handleException(str);

        sc.close();
    }
}
