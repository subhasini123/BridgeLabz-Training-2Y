import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        double base, height, areaInInches, areaInCm;

        Scanner input = new Scanner(System.in);

        // Take user input for base and height in inches
        System.out.print("Enter the base of the triangle in inches: ");
        base = input.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        height = input.nextDouble();

        // Calculate area in square inches
        areaInInches = 0.5 * base * height;

        // Convert area to square centimeters
        areaInCm = areaInInches * 6.4516;

        // Print results
        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + 
                           String.format("%.2f", areaInCm) + " square centimeters.");

        input.close();
    }
}

