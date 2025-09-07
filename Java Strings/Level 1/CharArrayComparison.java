import java.util.Scanner;

public class CharArrayComparison {

    // Method to return all characters in a string using charAt()
    public static char[] getCharsUsingCharAt(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next();

        // Get characters using custom method
        char[] customChars = getCharsUsingCharAt(input);

        // Get characters using built-in method
        char[] builtInChars = input.toCharArray();

        // Compare both arrays
        boolean areEqual = compareCharArrays(customChars, builtInChars);

        // Display results
        System.out.println("\nCharacters using custom method:");
        for (char c : customChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacters using toCharArray():");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both character arrays equal? " + areEqual);

        scanner.close();
    }
}

