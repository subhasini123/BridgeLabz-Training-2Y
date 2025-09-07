// Filename: AnagramCheck.java
import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("\\s+", ""); // ignore case and spaces
        str2 = str2.toLowerCase().replaceAll("\\s+", "");

        if (str1.length() != str2.length()) {
            return false; // lengths differ, cannot be anagrams
        }

        int[] freq = new int[256]; // ASCII frequency array

        // Count characters in str1
        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
        }

        // Subtract character counts using str2
        for (int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i)]--;
            if (freq[str2.charAt(i)] < 0) {
                return false; // character mismatch
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (areAnagrams(str1, str2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are NOT anagrams.");
        }

        sc.close();
    }
}
