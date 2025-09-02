// File name: LeapYearChecker.java
import java.util.Scanner;

public class LeapYearChecker {

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // Leap year rules
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check Gregorian calendar validity
        if (year < 1582) {
            System.out.println("The program only works for years >= 1582 (Gregorian calendar).");
        } else {
            // Check leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        sc.close();
    }
}
