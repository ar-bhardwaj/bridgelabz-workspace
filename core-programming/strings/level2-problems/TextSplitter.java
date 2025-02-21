import java.util.Scanner;

public class TextSplitter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close(); // Close scanner

        // Split words manually
        String[] words = splitWithoutSplit(input);

        // Store words and their lengths in a 2D array
        String[][] wordDetails = getWordsWithLengths(words);

        // Display the result
        displayTable(wordDetails);
    }

    // Method to split words manually without using split()
    public static String[] splitWithoutSplit(String text) {
        int length = getStringLength(text);
        int spaceCount = 0;

        // Count spaces to determine number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaceIndexes = new int[spaceCount + 1]; // Array for space positions
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = length; // Last word ends at length

        String[] words = new String[spaceIndexes.length]; // Array for words
        int start = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            words[i] = extractSubstring(text, start, spaceIndexes[i]); // Extract words
            start = spaceIndexes[i] + 1; // Move to next word
        }

        return words;
    }

    // Method to calculate string length without using length()
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

    // Method to extract substring without using substring()
    public static String extractSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }

    // Method to store words and their lengths in a 2D array
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] wordDetails = new String[words.length][2]; // 2D array

        for (int i = 0; i < words.length; i++) {
            wordDetails[i][0] = words[i]; // Store word
            wordDetails[i][1] = String.valueOf(getStringLength(words[i])); // Store length as String
        }

        return wordDetails;
    }

    // Method to display words and their lengths in a tabular format
    public static void displayTable(String[][] wordDetails) {
        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (String[] word : wordDetails) {
            System.out.println(word[0] + "\t" + Integer.parseInt(word[1])); // Convert String to int
        }
    }
}
