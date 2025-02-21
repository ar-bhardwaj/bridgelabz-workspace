
import java.util.Scanner;

public class CharacterRemover {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);
        
        // Close the scanner
        scanner.close();
        
        // Initialize a StringBuilder to store the modified string
        StringBuilder modifiedString = new StringBuilder();
        
        // Iterate through the input string
        for (char currentChar : inputString.toCharArray()) {
            // Append only if the current character is not the one to be removed
            if (currentChar != charToRemove) {
                modifiedString.append(currentChar);
            }
        }
        
        // Display the modified string
        System.out.println("Modified String: " + modifiedString.toString());
    }
}
