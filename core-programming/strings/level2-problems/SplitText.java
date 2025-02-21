import java.util.Scanner;

public class SplitText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Using custom split method
        String[] manualWords = splitWithoutMethod(input);

        // Using built-in split method
        String[] builtInWords = input.split(" ");

        // Compare and display results
        boolean isSame = compareArrays(manualWords, builtInWords);

        System.out.println("\nManual Split: " + java.util.Arrays.toString(manualWords));
        System.out.println("Built-in Split: " + java.util.Arrays.toString(builtInWords));
        System.out.println("Are both methods equal? " + isSame);

        scanner.close();
    }

    public static int findStringLength(String text) {
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

    public static int[] findSpaceIndexes(String text) {
        int length = findStringLength(text);
        int spaceCount = 0;

        // Count spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        int[] spaces = new int[spaceCount + 1]; // Store space indexes
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaces[index++] = i;
            }
        }
        spaces[index] = length; // Add last index for the last word
        return spaces;
    }

    public static String[] splitWithoutMethod(String text) {
        int[] spaces = findSpaceIndexes(text);
        int wordCount = spaces.length;
        String[] words = new String[wordCount];

        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            words[i] = text.substring(start, spaces[i]); // Extract words using indexes
            start = spaces[i] + 1; // Move to next word
        }
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }
        return true;
    }

}
