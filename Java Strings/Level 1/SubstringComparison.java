import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String customSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end && i < text.length(); i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter the original string: ");
        String original = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Substring using charAt()
        String customSub = customSubstring(original, start, end);

        // Substring using built-in method
        String builtInSub = "";
        if (start >= 0 && end <= original.length() && start < end) {
            builtInSub = original.substring(start, end);
        } else {
            System.out.println("⚠️ Invalid indices for built-in substring method.");
        }

        // Compare both substrings
        boolean areEqual = compareUsingCharAt(customSub, builtInSub);

        // Display results
        System.out.println("\nCustom substring (charAt): " + customSub);
        System.out.println("Built-in substring: " + builtInSub);
        System.out.println("Are both substrings equal? " + areEqual);

        scanner.close();
    }
}
