import java.util.Scanner;

public class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = scanner.nextInt();

        // 2D array: columns 0=weight, 1=height, 2=BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Input weight and height with validation
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");

            double weight;
            do {
                System.out.print("Enter weight in kg (positive value): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Invalid input. Weight must be positive.");
                }
            } while (weight <= 0);
            personData[i][0] = weight;

            double height;
            do {
                System.out.print("Enter height in meters (positive value): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Invalid input. Height must be positive.");
                }
            } while (height <= 0);
            personData[i][1] = height;
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(m)", "Weight(kg)", "BMI", "Status");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < number; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s\n",
                    personData[i][1],   // height
                    personData[i][0],   // weight
                    personData[i][2],   // BMI
                    weightStatus[i]);   // status
        }

        scanner.close();
    }
}
