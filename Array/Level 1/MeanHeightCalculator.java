import java.util.Scanner;

public class MeanHeightCalculator {
    public static void main(String[] args) {
        double[] heights = new double[11]; // Array for 11 players
        double sum = 0.0;

        Scanner scanner = new Scanner(System.in);

        // Input heights of 11 players
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + " (in cm): ");
            heights[i] = scanner.nextDouble();
            sum += heights[i]; // Add height to sum
        }

        // Calculate mean
        double mean = sum / heights.length;

        // Display result
        System.out.printf("\nMean height of the football team: %.2f cm\n", mean);

        scanner.close();
    }
}
