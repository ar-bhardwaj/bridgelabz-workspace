import java.util.Scanner;

public class TrimStringUsingCharAt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with spaces: ");
        String input = scanner.nextLine();
        scanner.close(); // Close scanner

        // Trim spaces using custom method
        int[] trimIndexes = findTrimIndexes(input);
        String trimmedText = createSubstring(input, trimIndexes[0], trimIndexes[1]);

        // Trim using built-in method
        String builtInTrimmed = input.trim();

        // Compare the results
        boolean isSame = compareStrings(trimmedText, builtInTrimmed);

        // Display results
        System.out.println("\nTrimmed String (Custom Method): [" + trimmedText + "]");
        System.out.println("Trimmed String (Built-in trim()): [" + builtInTrimmed + "]");
        System.out.println("Both methods give the same result: " + isSame);
    }

    // Method to find the start and end index of non-space characters
    public static int[] findTrimIndexes(String text) {
        int start = 0, end = getStringLength(text) - 1;

        // Find the first non-space character
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end };
    }

    // Method to create a substring using charAt()
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
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

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        int len1 = getStringLength(str1);
        int len2 = getStringLength(str2);

        if (len1 != len2)
            return false;

        for (int i = 0; i < len1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
