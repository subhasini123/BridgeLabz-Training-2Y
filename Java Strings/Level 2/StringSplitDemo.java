

import java.util.Scanner;

public class StringSplitDemo {

    // Method to find string length without using length()
    public static int getStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);  // throws exception when index exceeds
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string reached
        }
        return count;
    }

    // Method to split string into words manually
    public static String[] manualSplit(String str) {
        int n = getStringLength(str);

        // Step 1: Count words (by spaces)
        int wordCount = 1;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Step 2: Store words
        String[] words = new String[wordCount];
        StringBuilder currentWord = new StringBuilder();
        int wordIndex = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                currentWord.append(ch);
            } else {
                words[wordIndex++] = currentWord.toString();
                currentWord.setLength(0); // reset builder
            }
        }

        // Add the last word
        words[wordIndex] = currentWord.toString();

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    // Method to print string array
    public static void printArray(String[] arr) {
        for (String word : arr) {
            System.out.print(word + " | ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // Built-in split()
        String[] builtInSplit = input.split(" ");

        // Manual split()
        String[] manualSplit = manualSplit(input);

        // Compare results
        boolean isSame = compareArrays(builtInSplit, manualSplit);

        // Display
        System.out.println("\nOriginal Text: " + input);

        System.out.println("\nBuilt-in split() result:");
        printArray(builtInSplit);

        System.out.println("\nManual split result:");
        printArray(manualSplit);

        System.out.println("\nAre both results same? " + isSame);

        sc.close();
    }
}
