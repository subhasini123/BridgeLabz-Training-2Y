

import java.util.Scanner;

public class VowelConsonantType {

    // Method to check if a character is vowel, consonant or not a letter
    public static String checkCharacter(char ch) {
        // If uppercase, convert to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if it's a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to classify each character and return 2D array
    public static String[][] classifyCharacters(String str) {
        String[][] result = new String[str.length()][2];

        int i = 0;
        try {
            while (true) {
                char ch = str.charAt(i);
                result[i][0] = String.valueOf(ch);
                result[i][1] = checkCharacter(ch);
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] arr) {
        System.out.printf("%-10s %-15s%n", "Character", "Type");
        System.out.println("----------------------------");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] != null) { // Avoid null entries
                System.out.printf("%-10s %-15s%n", arr[i][0], arr[i][1]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Process
        String[][] result = classifyCharacters(input);

        // Display
        System.out.println("\nCharacter Classification:");
        displayTable(result);

        sc.close();
    }
}
