import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get Principal amount from user
        System.out.print("Enter the Principal amount: ");
        double principal = input.nextDouble();

        // Get Rate of Interest from user
        System.out.print("Enter the Rate of Interest: ");
        double rate = input.nextDouble();

        // Get Time in years from user
        System.out.print("Enter the Time (in years): ");
        double time = input.nextDouble();

        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The Simple Interest is: " + simpleInterest);

        input.close();
    }
}

