// File name: BMICalculator.java
import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; // Convert cm to meters
        return weight / (heightM * heightM);
    }

    // Method to determine BMI Status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2D array: weight | height | BMI
        double[][] data = new double[10][3];
        String[] bmiStatus = new String[10];

        // Take input
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            data[i][1] = sc.nextDouble();

            // Calculate BMI
            data[i][2] = calculateBMI(data[i][0], data[i][1]);

            // Get BMI Status
            bmiStatus[i] = getBMIStatus(data[i][2]);
        }

        // Display results
        System.out.println("\n--- BMI Report ---");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    data[i][0], data[i][1], data[i][2], bmiStatus[i]);
        }

        sc.close();
    }
}
