import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int tempNumber = Math.abs(number); // Handle negative numbers
        int count = 0;

        // Step 1: Count digits
        if (tempNumber == 0) {
            count = 1;  // number is zero
        } else {
            int temp = tempNumber;
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        // Step 2: Extract digits into array
        int[] digits = new int[count];
        int index = 0;
        tempNumber = Math.abs(number);

        while (tempNumber > 0) {
            digits[index] = tempNumber % 10;
            tempNumber /= 10;
            index++;
        }

        // Handle number 0 case
        if (count == 1 && digits[0] == 0) {
            // Already handled
        }

        // Step 3: Reverse array elements into another array
        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        // Step 4: Display reversed digits
        System.out.print("Reversed number digits: ");
        for (int digit : reversed) {
            System.out.print(digit);
        }
        System.out.println();

        scanner.close();
    }
}
