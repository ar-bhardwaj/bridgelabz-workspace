
import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        //  Find the length of the string manually
        int length = findLength(text);

        //  Find unique characters
        char[] uniqueChars = findUniqueCharacters(text, length);

        //  Display unique characters
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            if (c != '\0') { // Ignore empty slots
                System.out.print(c + " ");
            }
        }

        scanner.close();
    }

    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Access each character
                count++; // Increment count
            }
        } catch (IndexOutOfBoundsException e) {
            return count; // Return the count when out of bounds
        }
    }

    // Method to find unique characters
    public static char[] findUniqueCharacters(String text, int length) {
        char[] unique = new char[length]; // Array to store unique characters
        int uniqueIndex = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character is already in the unique array
            for (int j = 0; j < uniqueIndex; j++) {
                if (unique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, store in array
            if (isUnique) {
                unique[uniqueIndex++] = currentChar;
            }
        }

        return unique;
    }
}
