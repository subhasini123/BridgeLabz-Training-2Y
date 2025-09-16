
import java.util.Scanner;

public class UniqueCharFrequency {

    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            // check if character already appeared
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j] == ch) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = ch;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    // Method to find frequency of characters using unique characters
    public static String[][] findFrequency(String text) {
        char[] uniqueChars = uniqueCharacters(text);
        String[][] freqArr = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            int count = 0;

            // Count occurrences of ch in text
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }

            freqArr[i][0] = String.valueOf(ch);
            freqArr[i][1] = String.valueOf(count);
        }

        return freqArr;
    }

    // Method to display frequency in tabular format
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

        System.out.println("\nCharacter Frequency Using Unique Characters:");
        displayFrequency(frequency);

        sc.close();
    }
}
