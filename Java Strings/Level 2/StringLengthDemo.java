

import java.util.Scanner;

public class StringLengthDemo {

    // Method to find string length without using length()
    public static int getStringLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);  // will throw exception when index is out of bounds
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception indicates end of string
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input string
        System.out.print("Enter a string: ");
        String input = sc.next();   // next() takes single word input

        // User-defined method
        int customLength = getStringLength(input);

        // Built-in method
        int builtInLength = input.length();

        // Display results
        System.out.println("\nString: " + input);
        System.out.println("Length (User-defined): " + customLength);
        System.out.println("Length (Built-in)    : " + builtInLength);

        sc.close();
    }
}

