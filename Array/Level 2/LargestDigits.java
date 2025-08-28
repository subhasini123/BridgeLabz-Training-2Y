import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        int tempNumber = Math.abs(number);  // handle negative input by absolute value

        // Extract digits and store in array
        while (tempNumber != 0 && index < maxDigit) {
            int lastDigit = tempNumber % 10;
            digits[index] = lastDigit;
            tempNumber /= 10;
            index++;
        }

        if (index == 0) {  // number was 0
            digits[index] = 0;
            index = 1;
        }

        // Initialize largest and second largest
        int largest = -1;
        int secondLargest = -1;

        // Find largest and second largest
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
