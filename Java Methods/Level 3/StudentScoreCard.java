import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit marks for Physics, Chemistry, and Maths
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; // [students][PCM]
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int) (Math.random() * 90 + 10); // Physics
            scores[i][1] = (int) (Math.random() * 90 + 10); // Chemistry
            scores[i][2] = (int) (Math.random() * 90 + 10); // Maths
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // [students][total, avg, percentage]

        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            // Round to 2 decimal places
            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            results[i][0] = total;
            results[i][1] = avg;
            results[i][2] = percent;
        }
        return results;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] results) {
        System.out.println("StuID\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t\t" +
                    scores[i][2] + "\t" +
                    (int) results[i][0] + "\t" +
                    results[i][1] + "\t" +
                    results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate random scores
        int[][] scores = generateScores(n);

        // Calculate total, average, percentage
        double[][] results = calculateResults(scores);

        // Display scorecard
        System.out.println("\n--- Student Scorecard ---");
        displayScoreCard(scores, results);

        sc.close();
    }
}
