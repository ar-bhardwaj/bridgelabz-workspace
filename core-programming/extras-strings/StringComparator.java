import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter first string: ");
        String firstString = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String secondString = scanner.nextLine();
        
        // Close the scanner
        scanner.close();
        
        // Compare the two strings character by character
        int minLength = Math.min(firstString.length(), secondString.length());
        boolean areEqual = true;
        
        for (int i = 0; i < minLength; i++) {
            if (firstString.charAt(i) != secondString.charAt(i)) {
                areEqual = false;
                break;
            }
        }
        
        // Determine lexicographical order
        if (areEqual && firstString.length() == secondString.length()) {
            System.out.println("Both strings are equal.");
        } else if (firstString.compareTo(secondString) < 0) {
            System.out.println("\"" + firstString + "\" comes before \"" + secondString + "\" in lexicographical order.");
        } else {
            System.out.println("\"" + secondString + "\" comes before \"" + firstString + "\" in lexicographical order.");
        }
    }
}