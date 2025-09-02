import java.util.Random;
import java.util.Scanner;

public class RandomArrayStats {

    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + rand.nextInt(9000); // ensures 4-digit number
        }
        return arr;
    }

    // Method to calculate average of array
    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    // Method to find minimum value in array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to find maximum value in array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take size input from user
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        // Generate random array
        int[] randomArray = generate4DigitRandomArray(size);

        // Print generated array
        System.out.print("Generated 4-digit numbers: ");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calculate average, min, max
        double avg = calculateAverage(randomArray);
        int min = findMin(randomArray);
        int max = findMax(randomArray);

        // Display results
        System.out.println("Average: " + avg);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        sc.close();
    }
}
