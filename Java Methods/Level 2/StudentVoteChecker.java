// File name: StudentVoteChecker.java
import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Negative age is invalid
        } else if (age >= 18) {
            return true;  // Age 18 or above can vote
        } else {
            return false; // Below 18 cannot vote
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10]; // Array to store ages of 10 students
        StudentVoteChecker checker = new StudentVoteChecker();

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            // Call the method to check voting eligibility
            boolean canVote = checker.canStudentVote(ages[i]);

            if (ages[i] < 0) {
                System.out.println("Invalid age entered. Cannot vote.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote.");
            }
        }

        sc.close();
    }
}

