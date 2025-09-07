
import java.util.Scanner;

public class ReverseString {

    // Method to reverse a string
    public static String reverseString(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i); // append characters from end
        }

        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);

        sc.close();
    }
}
