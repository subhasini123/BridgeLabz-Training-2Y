import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number input from the user
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Define an array to store the multiplication results
        int[] table = new int[10];

        // Fill the array with multiplication results
        for (int i = 0; i < table.length; i++) {
            table[i] = number * (i + 1);
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table for " + number + ":");
        for (int i = 0; i < table.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        scanner.close();
    }
}
