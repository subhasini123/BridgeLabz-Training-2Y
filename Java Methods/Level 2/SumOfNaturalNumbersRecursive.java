// File name: SumOfNaturalNumbersRecursive.java
import java.util.Scanner;

public class SumOfNaturalNumbersRecursive {

    // Recursive method to find sum of first n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1; // base case
        }
        return n + sumRecursive(n - 1); // recursive step
    }

    // Formula method to find sum of first n natural numbers
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            // Compute results
            int sumRec = sumRecursive(n);
            int sumForm = sumFormula(n);

            // Display results
            System.out.println("Sum of first " + n + " natural numbers (Recursive) = " + sumRec);
            System.out.println("Sum of first " + n + " natural numbers (Formula)   = " + sumForm);

            // Compare
            if (sumRec == sumForm) {
                System.out.println("✅ Both methods give the same result!");
            } else {
                System.out.println("❌ Results do not match!");
            }
        }

        sc.close();
    }
}
