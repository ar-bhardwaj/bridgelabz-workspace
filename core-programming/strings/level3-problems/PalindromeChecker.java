import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Call three different palindrome check methods
        boolean isPalindrome1 = checkPalindromeIterative(text);
        boolean isPalindrome2 = checkPalindromeRecursive(text, 0, text.length() - 1);
        boolean isPalindrome3 = checkPalindromeUsingReverse(text);

        // Display results
        System.out.println("Using Iteration: " + (isPalindrome1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursion: " + (isPalindrome2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Reverse: " + (isPalindrome3 ? "Palindrome" : "Not a Palindrome"));

        scanner.close();
    }

    // **Logic 1: Check Palindrome using Iteration**
    public static boolean checkPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // Not a palindrome if characters don't match
            }
            start++;
            end--;
        }
        return true; // Palindrome if all characters match
    }

    // **Logic 2: Check Palindrome using Recursion**
    public static boolean checkPalindromeRecursive(String text, int start, int end) {
        if (start >= end)
            return true; // Base case: all characters matched
        if (text.charAt(start) != text.charAt(end))
            return false; // Not a palindrome
        return checkPalindromeRecursive(text, start + 1, end - 1); // Recursive call
    }

    // **Logic 3: Check Palindrome by Reversing the String**
    public static boolean checkPalindromeUsingReverse(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text); // Get reversed version

        // Compare original and reversed arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false; // Not a palindrome
            }
        }
        return true; // Palindrome if all characters match
    }

    // **Helper Method: Reverse a String**
    public static char[] reverseString(String text) {
        int length = text.length();
        char[] reversed = new char[length];

        // Store characters in reverse order
        for (int i = 0; i < length; i++) {
            reversed[i] = text.charAt(length - 1 - i);
        }
        return reversed;
    }
}
