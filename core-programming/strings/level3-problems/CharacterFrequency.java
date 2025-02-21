import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find frequency of characters
        String[] result = findFrequency(text);

        // Display results
        for (String row : result) {
            if (row != null) { // Ignore null values
                System.out.println(row);
            }
        }

        scanner.close();
    }

    // Method to find frequency of characters using nested loops
    public static String[] findFrequency(String text) {
        char[] characters = text.toCharArray(); // Convert string to character array
        String[] result = new String[characters.length]; // Array to store output
        int size = 0; // Counter for result array

        // Loop to find frequency of each character
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0')
                continue; // Skip already counted characters

            int count = 1; // Initialize frequency

            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    count++;
                    characters[j] = '0'; // Mark as counted
                }
            }

            // Store character and its frequency
            result[size++] = characters[i] + " " + count;
        }

        return result;
    }
}
