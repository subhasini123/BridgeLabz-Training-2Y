// Filename: LexicographicalCompare.java
import java.util.Scanner;

public class LexicographicalCompare {

    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2; // positive if str1 > str2, negative if str1 < str2
            }
        }

        // If all characters so far are equal, compare lengths
        return len1 - len2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String str1 = sc.nextLine();

        System.out.print("Enter String 2: ");
        String str2 = sc.nextLine();

        int result = compareStrings(str1, str2);

        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\".");
        }

        sc.close();
    }
}
