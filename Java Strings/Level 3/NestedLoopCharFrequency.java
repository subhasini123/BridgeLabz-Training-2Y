
import java.util.Scanner;

public class NestedLoopCharFrequency {

    // Method to find frequency using nested loops
    public static String[][] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];

        // Initialize frequencies to 1
        for (int i = 0; i < len; i++) {
            freq[i] = 1;
        }

        // Nested loop to count duplicates
        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') continue; // already counted

            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') uniqueCount++;
        }

        // Create 2D array for character and frequency
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index][0] = String.valueOf(chars[i]);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }

        return result;
    }

    // Method to display frequency table
    public static void displayFrequency(String[][] arr) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%-10s %-10s%n", arr[i][0], arr[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequency = findFrequency(text);

        System.out.println("\nCharacter Frequency Using Nested Loops:");
        displayFrequency(frequency);

        sc.close();
    }
}
