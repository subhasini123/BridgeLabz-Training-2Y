// Filename: IllegalArgumentDemo.java

import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method that generates the exception without handling
    public static void generateException(String input) {
        // This will cause IllegalArgumentException because start > end
        System.out.println("Generating exception...");
        String sub = input.substring(5, 2); 
        System.out.println("Substring: " + sub);
    }

    // Method that demonstrates handling the exception
    public static void handleException(String input) {
        try {
            System.out.println("Handling exception...");
            String sub = input.substring(5, 2); 
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // First call (abrupt termination)
        // Uncomment below line to see the crash
        // generateException(str);

        // Second call (handled properly)
        handleException(str);

        sc.close();
    }
}
