import java.util.*;

public class NumberChecker2 {

    // Method to count digits
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Method to store digits of a number in an array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // Method to reverse digits array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    // Method to check palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check Duck Number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int d : digits) {
            if (d == 0) return true; // duck number if contains zero (not leading zero)
        }
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Digits Array
        int[] digits = getDigitsArray(number);
        System.out.print("Digits Array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        System.out.println("Count of Digits: " + countDigits(number));

        // Reverse
        int[] reversed = reverseArray(digits);
        System.out.print("Reversed Digits Array: ");
        for (int d : reversed) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Compare arrays
        System.out.println("Are original and reversed arrays equal? " + areArraysEqual(digits, reversed));

        // Palindrome check
        System.out.println("Is Palindrome? " + isPalindrome(number));

        // Duck number check
        System.out.println("Is Duck Number? " + isDuckNumber(number));

        sc.close();
    }
}
