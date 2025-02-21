import java.util.Scanner;

public class MostFrequentCharacterFinder {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        char mostFrequentChar = '\0'; // Variable to store the most frequent character
        int maxCount = 0; // Variable to store the highest frequency
        
        // Convert the string to a character array
        char[] charArray = inputString.toCharArray();
        
        // Iterate through the character array
        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            int count = 0;
            
            // Count occurrences of the current character
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[j] == currentChar) {
                    count++;
                }
            }
            
            // Update the most frequent character if a higher count is found
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = currentChar;
            }
        }
        
        // Display the most frequent character
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "'");
    }
}
