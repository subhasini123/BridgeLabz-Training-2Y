
import java.util.Scanner;

public class CardDeckDistribution {

    // Method to initialize the deck
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int numPlayers, int numCards) {
        if (numPlayers * numCards > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] players = new String[numPlayers][numCards];
        int cardIndex = 0;

        for (int i = 0; i < numCards; i++) {
            for (int j = 0; j < numPlayers; j++) {
                players[j][i] = deck[cardIndex++];
            }
        }

        return players;
    }

    // Method to print players' cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize and shuffle deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        // Input number of players and cards
        System.out.print("Enter number of players: ");
        int numPlayers = sc.nextInt();

        System.out.print("Enter number of cards per player: ");
        int numCards = sc.nextInt();

        // Distribute cards
        String[][] players = distributeCards(deck, numPlayers, numCards);

        if (players != null) {
            // Print players' cards
            printPlayersCards(players);
        }

        sc.close();
    }
}
