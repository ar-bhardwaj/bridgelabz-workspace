import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {

    // Define suits and ranks of a standard deck of 52 cards
    static String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    static String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
    static int numOfCards = suits.length * ranks.length; // Total number of cards in a deck

    // Method to initialize the deck with all possible cards
    public static String[] initializeDeck() {
        String[] deck = new String[numOfCards]; // Create a deck of 52 cards
        int index = 0;

        // Combine each suit with each rank to create the full deck
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck using the Fisher-Yates algorithm
    public static void shuffleDeck(String[] deck) {
        Random random = new Random();

        for (int i = 0; i < deck.length; i++) {
            // Generate a random index to swap with
            int randomIndex = i + random.nextInt(deck.length - i);

            // Swap current card with randomly chosen card
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    // Method to distribute 'n' cards among 'x' players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n * x > numOfCards) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] players = new String[x][n]; // 2D array to store cards for each player
        int cardIndex = 0;

        // Distribute 'n' cards to each of the 'x' players
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to display the cards of each player
    public static void printPlayersCards(String[][] players) {
        if (players == null) {
            return; // No cards were distributed
        }

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println(); // Add a blank line for readability
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for number of players and cards per player
        System.out.print("Enter number of players: ");
        int numPlayers = scanner.nextInt();
        System.out.print("Enter number of cards per player: ");
        int numCards = scanner.nextInt();

        // Validate input
        if (numPlayers <= 0 || numCards <= 0 || numCards * numPlayers > numOfCards) {
            System.out.println("Invalid input! Check player and card count.");
        } else {
            String[] deck = initializeDeck(); // Initialize deck
            shuffleDeck(deck); // Shuffle deck
            String[][] players = distributeCards(deck, numCards, numPlayers); // Distribute cards
            printPlayersCards(players); // Display results
        }

        scanner.close();
    }
}
