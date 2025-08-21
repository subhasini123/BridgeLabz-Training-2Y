import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        int numberOfStudents;
        int handshakes;

        Scanner input = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();

        // Calculate maximum handshakes
        handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output result
        System.out.println("The maximum number of possible handshakes is " + handshakes);

        input.close();
    }
}

