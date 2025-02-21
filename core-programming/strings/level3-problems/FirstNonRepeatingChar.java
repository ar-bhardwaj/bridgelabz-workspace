import java.util.Scanner;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Step 2: Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(text);

        // Step 3: Display the result
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256]; // Array to store frequency of characters

        // Step 1: Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++; // Increment frequency based on ASCII value
        }

        // Step 2: Find first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (frequency[currentChar] == 1) { // If frequency is 1, return character
                return currentChar;
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }
}

