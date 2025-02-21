import java.util.Scanner;

public class LongestWordFinder {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner userScanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a sentence: ");
        String inputSentence = userScanner.nextLine();

        // Close the scanner
        userScanner.close();

        // Split the sentence into words
        String[] wordsArray = inputSentence.split(" ");

        // Initialize variables to track the longest word
        String longestWord = "";

        // Loop through each word in the sentence
        for (String word : wordsArray) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        // Display the longest word
        System.out.println("Longest word in the sentence: " + longestWord);
    }
}
