

import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and return BMI value + status
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to meters
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 decimals

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        return new String[]{String.valueOf(bmi), status};
    }

    // Method to compute full details for all persons
    public static String[][] computeAll(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiInfo = calculateBMI(weight, height);

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(height);
            result[i][2] = bmiInfo[0];
            result[i][3] = bmiInfo[1];
        }

        return result;
    }

    // Method to display data in tabular format
    public static void displayTable(String[][] arr) {
        System.out.printf("%-8s %-10s %-10s %-12s%n", "Weight", "Height(cm)", "BMI", "Status");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-8s %-10s %-10s %-12s%n",
                    arr[i][0], arr[i][1], arr[i][2], arr[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10; // team size
        double[][] data = new double[n][2]; // [weight, height]

        // Take input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Compute BMI and status
        String[][] result = computeAll(data);

        // Display results
        System.out.println("\nBMI Report:");
        displayTable(result);

        sc.close();
    }
}
