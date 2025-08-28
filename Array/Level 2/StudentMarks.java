import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // 2D array to store marks: n students x 3 subjects
        int[][] marks = new int[n][3];

        // Arrays to store percentage and grade
        double[] percentages = new double[n];
        char[] grades = new char[n];

        // Input marks for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = sc.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = sc.nextInt();

            // Calculate total and percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            // Determine grade based on percentage
            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 80) {
                grades[i] = 'B';
            } else if (percentages[i] >= 70) {
                grades[i] = 'C';
            } else if (percentages[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        // Display results
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            System.out.println("Physics: " + marks[i][0] + ", Chemistry: " + marks[i][1] + ", Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%, Grade: %c\n", percentages[i], grades[i]);
            System.out.println();
        }

        sc.close();
    }
}

