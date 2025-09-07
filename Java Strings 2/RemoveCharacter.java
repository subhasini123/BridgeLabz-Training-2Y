// Filename: RemoveCharacter.java
import java.util.Scanner;

public class RemoveCharacter {

    // Method to remove all occurrences of a character
    public static String removeCharacter(String text, char chToRemove) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch != chToRemove) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char chToRemove = sc.next().charAt(0);

        String modified = removeCharacter(input, chToRemove);

        System.out.println("Modified String: \"" + modified + "\"");

        sc.close();
    }
}
