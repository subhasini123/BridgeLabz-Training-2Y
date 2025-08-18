import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get base from user
        System.out.print("Enter the base: ");
        double base = input.nextDouble();

        // Get exponent from user
        System.out.print("Enter the exponent: ");
        double exponent = input.nextDouble();

        // Calculate base^exponent using Math.pow()
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        input.close();
    }
}

