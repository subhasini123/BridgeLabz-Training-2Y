

import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find string length without using length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // will throw exception when index is out of bounds
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

        // Count words
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
                currentWord.setLength(0);
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
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    // Method to find shortest and longest word indexes
    public static int[] findMinMax(String[][] table) {
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < table.length; i++) {
            int currentLen = Integer.parseInt(table[i][1]);
            int minLen = Integer.parseInt(table[minIndex][1]);
            int maxLen = Integer.parseInt(table[maxIndex][1]);

            if (currentLen < minLen) {
                minIndex = i;
            }
            if (currentLen > maxLen) {
                maxIndex = i;
            }
        }

        return new int[] {minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Split and get lengths
        String[] words = manualSplit(input);
        String[][] table = wordsWithLength(words);

        // Find shortest and longest
        int[] result = findMinMax(table);

        // Display
        System.out.println("\nWord\t\tLength");
        System.out.println("----------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }

        System.out.println("\nShortest word: " + table[result[0]][0] +
                           " (Length: " + table[result[0]][1] + ")");
        System.out.println("Longest word : " + table[result[1]][0] +
                           " (Length: " + table[result[1]][1] + ")");

        sc.close();
    }
}
