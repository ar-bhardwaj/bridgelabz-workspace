import java.util.Scanner;

public class SubstringCounter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scannerInput = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the main string: ");
        String mainString = scannerInput.nextLine();
        
        System.out.print("Enter the substring to count: ");
        String subString = scannerInput.nextLine();
        
        // Close the scanner
        scannerInput.close();
        
        // Initialize count variable
        int occurrenceCount = 0;
        int index = 0;
        
        // Loop through the string to find occurrences
        while ((index = mainString.indexOf(subString, index)) != -1) {
            occurrenceCount++;
            index += subString.length(); // Move index forward
        }
        
        // Display the result
        System.out.println("Occurrences of substring: " + occurrenceCount);
    }
}
