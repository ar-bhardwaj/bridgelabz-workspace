import java.util.*;

public class AnagramChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user for first string input
        System.out.print("Enter first string: ");
        String firstString = scanner.nextLine();

        // Prompt user for second string input
        System.out.print("Enter second string: ");
        String secondString = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Check if the two strings are anagrams
        if (areAnagrams(firstString, secondString)) {
            System.out.println("The given strings are anagrams.");
        } else {
            System.out.println("The given strings are not anagrams.");
        }
    }

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase for uniformity
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different, if so, they are not anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays and sort them
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        // Compare sorted arrays
        return Arrays.equals(array1, array2);
    }
}