// Filename: VotingEligibilityDemo.java

import java.util.Scanner;
import java.util.Random;

public class VotingEligibilityDemo {

    // Method to generate random ages for n students
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // Random 2-digit age (10–99)
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";  // invalid negative age
            } else if (ages[i] >= 18) {
                result[i][1] = "true";   // can vote
            } else {
                result[i][1] = "false";  // cannot vote
            }
        }
        return result;
    }

    // Method to display results in tabular format
    public static void displayTable(String[][] arr) {
        System.out.printf("%-10s %-15s%n", "Age", "Can Vote?");
        System.out.println("---------------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10s %-15s%n", arr[i][0], arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students (default 10 as per question)
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate random ages
        int[] ages = generateAges(n);

        // Check eligibility
        String[][] result = checkEligibility(ages);

        // Display result
        System.out.println("\nVoting Eligibility Table:");
        displayTable(result);

        sc.close();
    }
}
