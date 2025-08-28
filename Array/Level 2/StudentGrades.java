import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[][] marks = new int[n][3];   // 3 subjects: Physics, Chemistry, Maths
        double[] percentages = new double[n];
        char[] grades = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            boolean validInput = true;

            for (int j = 0; j < 3; j++) {
                do {
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                    System.out.print(subject + ": ");
                    int mark = scanner.nextInt();

                    if (mark < 0 || mark > 100) {
                        System.out.println("Invalid input. Marks must be between 0 and 100. Please re-enter.");
                        validInput = false;
                    } else {
                        marks[i][j] = mark;
                        validInput = true;
                    }
                } while (!validInput);
            }
        }

        // Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (total / 300.0) * 100;

            double p = percentages[i];
            if (p >= 90)
                grades[i] = 'A';
            else if (p >= 80)
                grades[i] = 'B';
            else if (p >= 70)
                grades[i] = 'C';
            else if (p >= 60)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }

        // Display results
        System.out.printf("%-10s %-10s %-10s %-12s %-12s %-6s\n",
                "Physics", "Chemistry", "Maths", "Percentage", "Grade", "Student");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10d %-10d %-12.2f %-12c Student %d\n",
                    marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i], i + 1);
        }

        scanner.close();
    }
}
