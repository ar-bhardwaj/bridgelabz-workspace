
// 1. Count Vowels and Consonants
import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] textualInput) {
        // Create a Scanner object to take input from the user
        Scanner userInput = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string: ");
        String givenText = userInput.nextLine();

        // Close the scanner to prevent resource leaks
        userInput.close();

        // Initialize counters for vowels and consonants
        int vowelTally = 0, consonantTally = 0;

        // Convert the input string to lowercase for uniformity
        givenText = givenText.toLowerCase();

        // Loop through each character in the string
        for (char characterUnit : givenText.toCharArray()) {
            // Check if the character is a letter (ignoring numbers and symbols)
            if (characterUnit >= 'a' && characterUnit <= 'z') {
                // Check if the character is a vowel
                if (characterUnit == 'a' || characterUnit == 'e' || characterUnit == 'i' || characterUnit == 'o'
                        || characterUnit == 'u') {
                    vowelTally++; // Increment vowel counter
                } else {
                    consonantTally++; // Increment consonant counter
                }
            }
        }

        // Display the counts of vowels and consonants
        System.out.println("Number of Vowels: " + vowelTally);
        System.out.println("Number of Consonants: " + consonantTally);
    }
}
