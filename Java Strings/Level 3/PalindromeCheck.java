
import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative check using start and end indexes
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive palindrome check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using char arrays and reversed array
    public static boolean isPalindromeUsingCharArray(String text) {
        int len = text.length();
        char[] original = text.toCharArray();
        char[] reverse = new char[len];

        // Reverse the string using charAt()
        for (int i = 0; i < len; i++) {
            reverse[i] = text.charAt(len - 1 - i);
        }

        // Compare original and reversed arrays
        for (int i = 0; i < len; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = sc.nextLine();

        // Approach 1: Iterative
        boolean iterativeResult = isPalindromeIterative(text);
        System.out.println("Palindrome check (Iterative): " + iterativeResult);

        // Approach 2: Recursive
        boolean recursiveResult = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Palindrome check (Recursive): " + recursiveResult);

        // Approach 3: Using char array
        boolean charArrayResult = isPalindromeUsingCharArray(text);
        System.out.println("Palindrome check (Char Array): " + charArrayResult);

        sc.close();
    }
}
