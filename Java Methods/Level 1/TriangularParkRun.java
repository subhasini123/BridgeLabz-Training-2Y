// File name: TriangularParkRun.java
import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate perimeter of triangle
    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // Method to calculate number of rounds
    public static double calculateRounds(double perimeter, double distance) {
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for sides of triangle
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate perimeter
        double perimeter = calculatePerimeter(side1, side2, side3);

        // Distance to run = 5000 meters (5 km)
        double distance = 5000;

        // Calculate number of rounds
        double rounds = calculateRounds(perimeter, distance);

        // Display result
        System.out.println("The athlete needs to complete " 
                           + Math.ceil(rounds) + " rounds to complete a 5 km run.");

        sc.close();
    }
}
