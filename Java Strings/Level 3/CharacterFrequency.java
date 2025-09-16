
import java.util.Scanner;

public class CharacterFrequency {

    // Method to find character frequencies
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // ASCII characters

        int len = text.length();
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count unique characters in the string
        int uniqueCount = 0;
        boolean[] counted = new boolean[256]; // to avoid duplicates
        for (int i = 0; i < len; i++) {
            int ascii = text.charAt(i);
            if (!counted[ascii]) {
                counted[ascii] = true;
                uniqueCount++;
            }
        }

        // Create 2D array for characters and frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < len; i++) {
            int ascii = text.charAt(i);
            if (freq[ascii] > 0) {
                result[index][0] = String.valueOf((char) ascii);
                result[index][1] = String.valueOf(freq[ascii]);
                freq[ascii] = 0; // mark as counted
                index++;
            }
        }

        return result;
    }

    // Method to display character frequency
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

        System.out.println("\nCharacter Frequency:");
        displayFrequency(frequency);

        sc.close();
    }
}
