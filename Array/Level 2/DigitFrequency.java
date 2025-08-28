import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();  // Supports large numbers

        // Step 2: Convert number to string to find digits
        String numStr = Long.toString(Math.abs(number));  // In case of negative input

        // Step 3: Frequency array (size 10 for digits 0 to 9)
        int[] frequency = new int[10];

        // Step 4: Loop through digits and count frequency
        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';  // Convert char to int
            frequency[digit]++;
        }

        // Step 5: Display frequency
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " => " + frequency[i] + " time(s)");
            }
        }

        sc.close();
    }
}

