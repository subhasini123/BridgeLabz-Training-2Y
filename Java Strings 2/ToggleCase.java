// Filename: ToggleCase.java
import java.util.Scanner;

public class ToggleCase {

    // Method to toggle the case of each character
    public static String toggleCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase
                result += (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase
                result += (char) (ch - 32);
            } else {
                // Keep non-alphabetic characters unchanged
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String toggled = toggleCase(input);

        System.out.println("Toggled case string: " + toggled);

        sc.close();
    }
}
