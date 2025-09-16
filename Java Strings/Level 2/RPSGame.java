

import java.util.Scanner;

public class RPSGame {

    // Method to get computer choice (0=Rock, 1=Paper, 2=Scissors)
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }

    // Method to determine winner
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) {
            return "Draw";
        } else if ((user.equals("Rock") && computer.equals("Scissors")) ||
                   (user.equals("Paper") && computer.equals("Rock")) ||
                   (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    // Method to calculate summary (wins and percentages)
    public static String[][] calculateStats(int userWins, int compWins, int draws, int totalGames) {
        String[][] stats = new String[2][3];

        double userPercent = ((double) userWins / totalGames) * 100;
        double compPercent = ((double) compWins / totalGames) * 100;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f%%", compPercent);

        return stats;
    }

    // Method to display results
    public static void displayResults(String[][] gameResults, String[][] summary) {
        System.out.printf("%-10s %-15s %-15s %-10s%n", "Game", "User Choice", "Computer Choice", "Winner");
        System.out.println("--------------------------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.printf("%-10s %-15s %-15s %-10s%n",
                    gameResults[i][0], gameResults[i][1], gameResults[i][2], gameResults[i][3]);
        }

        System.out.println("\nSummary:");
        System.out.printf("%-10s %-10s %-15s%n", "Player", "Wins", "Win %");
        System.out.println("-----------------------------------");
        for (int i = 0; i < summary.length; i++) {
            System.out.printf("%-10s %-10s %-15s%n", summary[i][0], summary[i][1], summary[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of games
        System.out.print("Enter number of games: ");
        int totalGames = sc.nextInt();
        sc.nextLine(); // consume newline

        // Arrays to store game results
        String[][] gameResults = new String[totalGames][4];

        int userWins = 0, compWins = 0, draws = 0;

        // Play each game
        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nEnter your choice (Rock, Paper, Scissors): ");
            String userChoice = sc.nextLine().trim();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;

            gameResults[i][0] = String.valueOf(i + 1);
            gameResults[i][1] = userChoice;
            gameResults[i][2] = compChoice;
            gameResults[i][3] = winner;
        }

        // Calculate summary
        String[][] summary = calculateStats(userWins, compWins, draws, totalGames);

        // Display all results
        System.out.println("\nGame Results:");
        displayResults(gameResults, summary);

        sc.close();
    }
}
