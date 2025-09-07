import java.util.Scanner;

public class StringIndexDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        // Accessing index beyond the string length
        System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {
        try {
            System.out.println("Character at index " + text.length() + ": " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("⚠️ Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        System.out.println("\n🔴 Demonstrating StringIndexOutOfBoundsException:");
        try {
            generateException(input); // This will throw the exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("❌ Exception occurred in generateException(): " + e.getMessage());
        }

        System.out.println("\n🟢 Handling StringIndexOutOfBoundsException gracefully:");
        handleException(input); // This handles the exception safely

        scanner.close();
    }
}
