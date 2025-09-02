// File name: HandshakeCalculator.java
import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum handshakes using combination formula
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate maximum handshakes
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display result
        System.out.println("The maximum number of possible handshakes among " 
                           + numberOfStudents + " students is: " + handshakes);

        sc.close();
    }
}
