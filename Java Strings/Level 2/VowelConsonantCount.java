

import java.util.Scanner;

public class VowelConsonantCount {

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

    // Method to count vowels and consonants
    public static int[] countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;

        int i = 0;
        try {
            while (true) {
                char ch = str.charAt(i);
                String type = checkCharacter(ch);

                if (type.equals("Vowel")) {
                    vowels++;
                } else if (type.equals("Consonant")) {
                    consonants++;
                }

                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // End of string
        }

        return new int[] {vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Count vowels & consonants
        int[] result = countVowelsConsonants(input);

        // Display
        System.out.println("\nInput String: " + input);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);

        sc.close();
    }
}

