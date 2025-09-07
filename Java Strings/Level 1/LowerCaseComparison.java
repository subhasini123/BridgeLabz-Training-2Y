

import java.util.Scanner;

public class LowerCaseComparison {

    // Method to manually convert uppercase letters to lowercase
    public static String manualToLowerCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // If character is uppercase, convert to lowercase using ASCII difference
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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

        // Using built-in toLowerCase()
        String builtInLower = input.toLowerCase();

        // Using manual method
        String manualLower = manualToLowerCase(input);

        // Compare both results
        boolean isSame = compareStrings(builtInLower, manualLower);

        // Display results
        System.out.println("\nOriginal Text: " + input);
        System.out.println("Built-in toLowerCase: " + builtInLower);
        System.out.println("Manual toLowerCase : " + manualLower);
        System.out.println("Are both results same? " + isSame);

        sc.close();
    }
}

