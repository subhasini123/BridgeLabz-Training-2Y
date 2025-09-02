// File name: TrigonometricFunctions.java
import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine, and tangent
    // result[0] = sine, result[1] = cosine, result[2] = tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Calculate trig values
        double[] result = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine   = " + result[0]);
        System.out.println("Cosine = " + result[1]);
        System.out.println("Tangent= " + result[2]);

        sc.close();
    }
}
