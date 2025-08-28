import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number to generate multiplication table from 6 to 9: ");
        int number = scanner.nextInt();

        // Array to store results for 6 to 9 (4 values)
        int[] multiplicationResult = new int[4];

        // Compute and store multiplication results
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6; // Starts from 6 to 9
            multiplicationResult[i] = number * multiplier;
        }

        // Display the results
        System.out.println("\nMultiplication Table for " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            int multiplier = i + 6;
            System.out.println(number + " * " + multiplier + " = " + multiplicationResult[i]);
        }

        scanner.close();
    }
}
