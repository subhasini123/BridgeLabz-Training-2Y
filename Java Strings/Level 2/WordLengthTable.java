

import java.util.Scanner;

public class WordLengthTable {

    // Method to find string length without using length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // will throw exception at end
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End reached
        }
        return count;
    }

    // Method to manually split string into words
    public static String[] manualSplit(String str) {
        int n = getStringLength(str);

        // Count words (by spaces)
        int wordCount = 1;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store words
        String[] words = new String[wordCount];
        StringBuilder currentWord = new StringBuilder();
        int wordIndex = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                currentWord.append(ch);
            } else {
                words[wordIndex++] = currentWord.toString();
                currentWord.setLength(0); // reset
            }
        }

        // Add last word
        words[wordIndex] = currentWord.toString();

        return words;
    }

    // Method to create 2D array with word and its length
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = getStringLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(len); // store length as String
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Split text
        String[] words = manualSplit(input);

        // Get 2D array [word, length]
        String[][] table = wordsWithLength(words);

        // Display in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");
        for (int i = 0; i < table.length; i++) {
            String word = table[i][0];
            int length = Integer.parseInt(table[i][1]); // convert String -> Integer
            System.out.println(word + "\t\t" + length);
        }

        sc.close();
    }
}
