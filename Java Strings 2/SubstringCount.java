// Filename: SubstringCount.java
import java.util.Scanner;

public class SubstringCount {

    // Method to count occurrences of a substring
    public static int countSubstring(String text, String sub) {
        int count = 0;
        int textLength = text.length();
        int subLength = sub.length();

        for (int i = 0; i <= textLength - subLength; i++) {
            boolean match = true;

            for (int j = 0; j < subLength; j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text = sc.nextLine();

        System.out.print("Enter the substring to search: ");
        String sub = sc.nextLine();

        int occurrences = countSubstring(text, sub);

        System.out.println("The substring \"" + sub + "\" occurs " + occurrences + " times.");

        sc.close();
    }
}
