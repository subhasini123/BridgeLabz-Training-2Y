
import java.util.Scanner;

public class RemoveDuplicates {

    // Method to remove duplicate characters
    public static String removeDuplicates(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is already in result
            boolean isDuplicate = false;
            for (int j = 0; j < result.length(); j++) {
                if (ch == result.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String modified = removeDuplicates(input);

        System.out.println("String after removing duplicates: " + modified);

        sc.close();
    }
}

