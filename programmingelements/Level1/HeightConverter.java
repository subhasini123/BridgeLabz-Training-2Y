import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        double heightCm;

        Scanner input = new Scanner(System.in);

        // Taking height in cm from user
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();

        // Convert cm to total inches
        double totalInches = heightCm / 2.54;

        // Convert inches to feet and remaining inches
        int feet = (int)(totalInches / 12);
        double inches = totalInches % 12;

        // Output the result
        System.out.println("Your Height in cm is " + heightCm + 
                           " while in feet is " + feet + 
                           " and inches is " + String.format("%.2f", inches));

        input.close();
    }
}

