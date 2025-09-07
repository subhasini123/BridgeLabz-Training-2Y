

import java.util.Scanner;

public class UpperCaseComparison {

    // Method to manually convert lowercase letters to uppercase
    public static String manualToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is lowercase, convert to uppercase using ASCII difference
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }

            result.append(ch);
        }

        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Using built-in toUpperCase()
        String builtInUpper = input.toUpperCase();

        // Using manual method
        String manualUpper = manualToUpperCase(input);

        // Compare both results
        boolean isSame = compareStrings(builtInUpper, manualUpper);

        // Display results
        System.out.println("\nOriginal Text: " + input);
        System.out.println("Built-in toUpperCase: " + builtInUpper);
        System.out.println("Manual toUpperCase : " + manualUpper);
        System.out.println("Are both results same? " + isSame);

        sc.close();
    }
}
