import java.util.*;

public class NumberChecker {

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

    // Method to check Duck number (contains zero but not starting with zero)
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == number;
    }

    // Method to find largest and second largest digit
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find smallest and second smallest digit
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method to test
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Digits array
        int[] digits = getDigitsArray(number);
        System.out.print("Digits Array: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }
        System.out.println();

        // Duck number check
        System.out.println("Is Duck Number? " + isDuckNumber(number));

        // Armstrong number check
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number));

        // Largest and second largest
        int[] largestPair = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestPair[0]);
        System.out.println("Second Largest digit: " + largestPair[1]);

        // Smallest and second smallest
        int[] smallestPair = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestPair[0]);
        System.out.println("Second Smallest digit: " + smallestPair[1]);

        sc.close();
    }
}
