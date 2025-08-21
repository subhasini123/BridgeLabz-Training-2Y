import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        double feet, yards, miles;

        Scanner input = new Scanner(System.in);

        // Input: distance in feet
        System.out.print("Enter the distance in feet: ");
        feet = input.nextDouble();

        // Convert feet to yards and miles
        yards = feet / 3;
        miles = yards / 1760;

        // Output the result
        System.out.println("The distance is " + feet + " feet, which is " +
                           String.format("%.2f", yards) + " yards and " +
                           String.format("%.6f", miles) + " miles.");

        input.close();
    }
}

