import java.util.Scanner;

public class EuclideanAndLineEquation {

    // Method to calculate Euclidean distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to find slope and y-intercept of a line
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double slope = (y2 - y1) / (x2 - x1);   // m = (y2 - y1) / (x2 - x1)
        double intercept = y1 - slope * x1;     // b = y1 - m*x1
        return new double[]{slope, intercept};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for two points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Compute distance
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("\nEuclidean Distance = " + distance);

        // Compute slope & intercept
        if (x1 == x2) {
            System.out.println("The line is vertical. Equation: x = " + x1);
        } else {
            double[] line = findLineEquation(x1, y1, x2, y2);
            double slope = line[0];
            double intercept = line[1];
            System.out.println("Equation of Line: y = " + slope + "x + " + intercept);
        }

        sc.close();
    }
}

