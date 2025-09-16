

import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random scores for PCM subjects
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // 3 subjects: Physics, Chemistry, Math

        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(90) + 10; // Physics
            scores[i][1] = rand.nextInt(90) + 10; // Chemistry
            scores[i][2] = rand.nextInt(90) + 10; // Math
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // [Total, Average, Percentage]

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            // Round to 2 digits
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }
        return results;
    }

    // Method to calculate grades
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];

        for (int i = 0; i < results.length; i++) {
            double percent = results[i][2];
            if (percent >= 90) grades[i] = "A";
            else if (percent >= 80) grades[i] = "B";
            else if (percent >= 70) grades[i] = "C";
            else if (percent >= 60) grades[i] = "D";
            else if (percent >= 50) grades[i] = "E";
            else grades[i] = "F";
        }
        return grades;
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.printf("%-8s %-8s %-8s %-8s %-8s %-10s %-12s %-6s%n",
                "Student", "Physics", "Chem", "Math", "Total", "Average", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-8d %-8d %-8d %-8d %-8.0f %-10.2f %-12.2f %-6s%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate random scores
        int[][] scores = generateScores(n);

        // Calculate total, average, percentage
        double[][] results = calculateResults(scores);

        // Calculate grades
        String[] grades = calculateGrades(results);

        // Display scorecard
        System.out.println("\nStudent Scorecard:");
        displayScorecard(scores, results, grades);

        sc.close();
    }
}
