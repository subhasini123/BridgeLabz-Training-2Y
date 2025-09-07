// Filename: MostFrequentCharacter.java
import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find the most frequent character
    public static char findMostFrequentChar(String text) {
        int[] freq = new int[256]; // ASCII character frequency
        text = text.toLowerCase(); // optional: ignore case

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Find the character with maximum frequency
        int max = -1;
        char result = ' ';

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] > max) {
                max = freq[ch];
                result = ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char mostFrequent = findMostFrequentChar(input);

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

        sc.close();
    }
}
