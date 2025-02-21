import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for two texts
        System.out.print("Enter first text: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter second text: ");
        String text2 = scanner.nextLine();

        // Call method to check anagram
        boolean isAnagram = checkAnagram(text1, text2);

        // Display the result
        System.out.println(isAnagram ? "The texts are anagrams." : "The texts are NOT anagrams.");

        scanner.close();
    }

    // **Method to check if two texts are anagrams**
    public static boolean checkAnagram(String text1, String text2) {
        // Step 1: Check if lengths are equal
        if (text1.length() != text2.length()) {
            return false; // If lengths are different, not an anagram
        }

        // Step 2: Create frequency arrays for both texts (256 for all ASCII characters)
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        // Step 3: Count frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++; // Increment count for text1
            freq2[text2.charAt(i)]++; // Increment count for text2
        }

        // Step 4: Compare frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false; // If any frequency doesn't match, not an anagram
            }
        }

        return true; // If all frequencies match, it's an anagram
    }
}
