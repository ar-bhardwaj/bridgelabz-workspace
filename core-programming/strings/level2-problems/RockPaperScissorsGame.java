import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Take user input for number of rounds
        System.out.print("Enter the number of rounds to play: ");
        int rounds = scanner.nextInt();
        
        int userWins = 0, computerWins = 0, draws = 0;
        String[][] results = new String[rounds][3]; // Store game results

        // Step 2: Play the game for the given number of rounds
        for (int i = 0; i < rounds; i++) {
            System.out.print("\nEnter your choice (rock, paper, scissors): ");
            String userChoice = scanner.next().toLowerCase();
            
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;

            // Store results
            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }

        // Step 3: Display game results and stats
        displayResults(results, userWins, computerWins, draws, rounds);
        
        scanner.close();
    }

    // Method to generate a random choice for the computer
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3); // Generates 0, 1, or 2
        return choice == 0 ? "rock" : (choice == 1 ? "paper" : "scissors");
    }

    // Method to determine the winner based on rules
    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("scissors") && computer.equals("paper")) ||
            (user.equals("paper") && computer.equals("rock"))) {
            return "User";
        }
        return "Computer";
    }

    // Method to display results and statistics
    public static void displayResults(String[][] results, int userWins, int computerWins, int draws, int rounds) {
        System.out.println("\nGame Results:");
        System.out.println("User Choice | Computer Choice | Winner");
        for (String[] result : results) {
            System.out.println(result[0] + " | " + result[1] + " | " + result[2]);
        }

        // Step 4: Calculate and display win percentage
        double userWinPercentage = (userWins * 100.0) / rounds;
        double computerWinPercentage = (computerWins * 100.0) / rounds;

        System.out.println("\nFinal Statistics:");
        System.out.println("User Wins: " + userWins + " | Computer Wins: " + computerWins + " | Draws: " + draws);
        System.out.printf("User Win Percentage: %.2f%% | Computer Win Percentage: %.2f%%\n", userWinPercentage, computerWinPercentage);
    }
}
