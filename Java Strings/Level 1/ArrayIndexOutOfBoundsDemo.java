

import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method that generates the exception without handling
    public static void generateException(String[] names, int index) {
        System.out.println("Generating ArrayIndexOutOfBoundsException...");
        System.out.println("Name at index " + index + " : " + names[index]); // may crash
    }

    // Method that demonstrates handling the exception
    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Handling ArrayIndexOutOfBoundsException...");
            System.out.println("Name at index " + index + " : " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array of names
        String[] names = {"Alice", "Bob", "Charlie", "David"};

        System.out.print("Enter an index to access (0 to " + (names.length - 1) + "): ");
        int index = sc.nextInt();

        // First call (may crash)
        // Uncomment below line to see abrupt termination
        // generateException(names, index);

        // Second call (handled properly)
        handleException(names, index);

        sc.close();
    }
}
