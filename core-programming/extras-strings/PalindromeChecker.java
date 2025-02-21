import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner userScanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a string to check for palindrome: ");
        String inputString = userScanner.nextLine();

        // Close the scanner
        userScanner.close();

        // Initialize an empty string to store reversed text
        String reversedString = "";

        // Loop through the original string in reverse order
        for (int index = inputString.length() - 1; index >= 0; index--) {
            reversedString += inputString.charAt(index);
        }

        // Check if the original string and reversed string are the same
        if (inputString.equalsIgnoreCase(reversedString)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }
    }
}