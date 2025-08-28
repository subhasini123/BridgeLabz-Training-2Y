import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a positive integer to find its factors: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            return;
        }

        // Initial setup
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find factors and store in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize the array if needed
                if (index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }
                // Store the factor
                factors[index] = i;
                index++;
            }
        }

        // Display the factors
        System.out.println("\nFactors of " + number + ":");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }

        System.out.println(); // clean line
        scanner.close();
    }
}
