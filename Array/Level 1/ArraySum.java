import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        double[] numbers = new double[10]; // Array to hold up to 10 values
        double total = 0.0;
        int index = 0;

        Scanner scanner = new Scanner(System.in);

        // Taking input using infinite loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double input = scanner.nextDouble();

            if (input <= 0) {
                break; // Stop if 0 or negative number is entered
            }

            if (index == 10) {
                System.out.println("Maximum of 10 entries reached.");
                break; // Stop if array is full
            }

            numbers[index] = input;
            index++;
        }

        // Display entered numbers and calculate the total
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println("Number " + (i + 1) + ": " + numbers[i]);
            total += numbers[i];
        }

        System.out.println("\nTotal of all numbers: " + total);

        scanner.close();
    }
}
