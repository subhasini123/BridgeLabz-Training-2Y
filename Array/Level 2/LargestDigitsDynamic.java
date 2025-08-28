import java.util.Scanner;

public class LargestDigitsDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        int tempNumber = Math.abs(number);  // handle negative input

        // Extract digits with dynamic array resizing
        while (tempNumber != 0) {
            int lastDigit = tempNumber % 10;
            tempNumber /= 10;

            if (index == maxDigit) {
                // Increase array size by 10
                maxDigit += 10;
                int[] tempArray = new int[maxDigit];
                // Copy old digits to new array
                for (int i = 0; i < digits.length; i++) {
                    tempArray[i] = digits[i];
                }
                digits = tempArray;
            }

            digits[index] = lastDigit;
            index++;
        }

        // Handle case when input is 0
        if (index == 0) {
            digits[index] = 0;
            index = 1;
        }

        // Find largest and second largest
        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("\nDigits stored in array:");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit: " + largest);

        if (secondLargest == -1) {
            System.out.println("No second largest digit found (all digits may be equal).");
        } else {
            System.out.println("Second largest digit: " + secondLargest);
        }

        scanner.close();
    }
}
