import java.util.Scanner;

public class DuplicateRemover {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner inputReader = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string to remove duplicates: ");
        String originalString = inputReader.nextLine();

        // Close the scanner
        inputReader.close();

        // Initialize a StringBuilder to store unique characters
        StringBuilder uniqueCharacters = new StringBuilder();

        // Loop through each character in the input string
        for (char character : originalString.toCharArray()) {
            // Append the character only if it is not already in StringBuilder
            if (uniqueCharacters.indexOf(String.valueOf(character)) == -1) {
                uniqueCharacters.append(character);
            }
        }

        // Display the modified string without duplicates
        System.out.println("String after removing duplicates: " + uniqueCharacters.toString());
    }
}