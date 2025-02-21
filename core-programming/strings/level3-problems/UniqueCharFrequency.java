import java.util.Scanner;

public class UniqueCharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Find frequency of unique characters
        String[][] result = findFrequency(text, uniqueChars);

        // Display results
        System.out.println("\nCharacter | Frequency");
        System.out.println("---------------------");
        for (String[] row : result) {
            System.out.println("   " + row[0] + "      |    " + row[1]);
        }

        scanner.close();
    }

    // Method to find unique characters in the string
    public static char[] findUniqueCharacters(String text) {
        StringBuilder unique = new StringBuilder();

        // Loop through the string to find unique characters
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (unique.indexOf(String.valueOf(ch)) == -1) {
                unique.append(ch);
            }
        }

        return unique.toString().toCharArray(); // Convert to array
    }

    // Method to find frequency of unique characters
    public static String[][] findFrequency(String text, char[] uniqueChars) {
        String[][] frequencyTable = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            int count = 0;

            // Count occurrences of unique character
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }

            frequencyTable[i][0] = String.valueOf(ch);
            frequencyTable[i][1] = String.valueOf(count);
        }

        return frequencyTable;
    }
}
