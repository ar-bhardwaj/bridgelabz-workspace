import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner userPrompt = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string to reverse: ");
        String originalText = userPrompt.nextLine();
        
        // Close the scanner
        userPrompt.close();
        
        // Initialize an empty string to store reversed text
        String reversedText = "";
        
        // Loop through the original string in reverse order
        for (int index = originalText.length() - 1; index >= 0; index--) {
            reversedText += originalText.charAt(index);
        }
        
        // Display the reversed string
        System.out.println("Reversed String: " + reversedText);
    }
}
