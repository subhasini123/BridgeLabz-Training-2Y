// File name: SumOfNaturalNumbers.java
import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate sum of first n natural numbers using loop
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Calculate sum
            int sum = calculateSum(n);

            // Display result
            System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        }

        sc.close();
    }
}
