

import java.util.Scanner;

public class CustomTrimDemo {

    // Method to find start and end index (ignoring leading and trailing spaces)
    public static int[] findTrimIndexes(String str) {
        int start = 0, end = str.length() - 1;

        // Trim leading spaces
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= 0 && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        // Find start and end index for trimming
        int[] indexes = findTrimIndexes(input);

        // Custom trimming
        String customTrimmed = "";
        if (indexes[0] <= indexes[1]) {
            customTrimmed = customSubstring(input, indexes[0], indexes[1]);
        }

        // Built-in trimming
        String builtInTrimmed = input.trim();

        // Compare
        boolean isEqual = compareStrings(customTrimmed, builtInTrimmed);

        // Display
        System.out.println("\nOriginal String: [" + input + "]");
        System.out.println("Custom Trimmed : [" + customTrimmed + "]");
        System.out.println("Built-in Trim  : [" + builtInTrimmed + "]");
        System.out.println("Are both equal? " + isEqual);

        sc.close();
    }
}
