import java.util.Scanner;
import java.util.Random;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // S Take user input for number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Generate random ages for students
        int[] ages = generateAges(n);

        // Check voting eligibility for each student
        String[][] results = checkVotingEligibility(ages);

        //  Display the results in a simple format
        displayResults(results);

        scanner.close();
    }

    // Method to generate random ages for students
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(82) + 10; // Generates a random age between 10 and 91
        }
        return ages;
    }

    // Method to check if a student is eligible to vote
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]); // Convert age to string for storage

            //Check if age is 18 or above for voting eligibility
            if (ages[i] >= 18) {
                results[i][1] = "Can Vote"; // Eligible to vote
            } else {
                results[i][1] = "Cannot Vote"; // Not eligible to vote
            }
        }
        return results;
    }

    // Method to display the results in a simple format
    public static void displayResults(String[][] results) {
        System.out.println("\nVoting Eligibility Results:");
        for (String[] row : results) {
            System.out.println("Age: " + row[0] + " - " + row[1]);
        }
    }
}
