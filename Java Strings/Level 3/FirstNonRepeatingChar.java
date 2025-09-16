
import java.util.Scanner;

public class FirstNonRepeatingChar {

    // Method to find the first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256]; // ASCII character frequencies

        // Count frequency of each character
        int len = text.length();
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Find first non-repeating character
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // Return null character if no non-repeating character found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char firstNonRepeat = findFirstNonRepeating(text);

        if (firstNonRepeat != '\0') {
            System.out.println("First non-repeating character: " + firstNonRepeat);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }

        sc.close();
    }
}
