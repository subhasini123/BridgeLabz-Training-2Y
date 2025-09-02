// File name: ChocolateDistribution.java
import java.util.Scanner;

public class ChocolateDistribution {

    // Method to calculate distribution
    // result[0] = chocolates per child, result[1] = remaining chocolates
    public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) {
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        if (numberOfChildren <= 0) {
            System.out.println("Error: Number of children must be greater than 0.");
        } else {
            // Call method
            int[] result = distributeChocolates(numberOfChocolates, numberOfChildren);

            // Display results
            System.out.println("Each child will get " + result[0] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[1]);
        }

        sc.close();
    }
}
