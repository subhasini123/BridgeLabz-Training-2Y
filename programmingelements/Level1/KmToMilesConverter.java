import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        double km;
        double miles;

        Scanner input = new Scanner(System.in);  // Create Scanner object to read input

        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();  // Read input from user

        miles = km / 1.6;  // Convert km to miles

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();  // Close the Scanner
    }
}

