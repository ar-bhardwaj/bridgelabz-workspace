import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close(); // Close scanner

        // Get count of vowels and consonants
        int[] counts = countVowelsAndConsonants(input);

        // Display results
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }

    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        int length = getStringLength(text); // Get length without length() method

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (isVowel(ch)) {
                vowels++;
            } else if (isConsonant(ch)) {
                consonants++;
            }
        }
        return new int[]{vowels, consonants}; // Return counts
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = convertToLower(ch); // Convert to lowercase manually
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    // Method to check if a character is a consonant
    public static boolean isConsonant(char ch) {
        ch = convertToLower(ch);
        return (ch >= 'a' && ch <= 'z' && !isVowel(ch));
    }

    // Method to convert uppercase to lowercase without toLowerCase()
    public static char convertToLower(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32); // ASCII conversion
        }
        return ch;
    }

    // Method to find string length without using length()
    public static int getStringLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Access each character
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count; // Return length when out of bounds
        }
    }
}

