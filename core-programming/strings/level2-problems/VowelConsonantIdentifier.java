import java.util.Scanner;

public class VowelConsonantIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close(); // Close scanner

        // Get character classifications
        String[][] result = classifyCharacters(input);

        // Display result in tabular format
        displayTable(result);
    }

    // Method to classify characters in the string
    public static String[][] classifyCharacters(String text) {
        int length = getStringLength(text); // Get length without using length()
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch); // Store character
            result[i][1] = getCharacterType(ch); // Store type (Vowel, Consonant, or Not a Letter)
        }
        return result;
    }

    // Method to determine if a character is a vowel, consonant, or not a letter
    public static String getCharacterType(char ch) {
        ch = convertToLower(ch); // Convert uppercase to lowercase manually

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            }
            return "Consonant";
        }
        return "Not a Letter";
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

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] data) {
        System.out.println("\nCharacter | Type");
        System.out.println("----------------");
        for (String[] row : data) {
            System.out.printf("    %s     | %s\n", row[0], row[1]);
        }
    }
}
