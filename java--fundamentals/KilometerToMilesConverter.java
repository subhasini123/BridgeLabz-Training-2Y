import java.util.Scanner;

public class KilometerToMilesConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = input.nextDouble();

        // Convert kilometers to miles
        double miles = kilometers * 0.621371;

        // Display the result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        input.close();
    }
}

