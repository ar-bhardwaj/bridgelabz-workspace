import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Find character frequencies
        findFrequency(text);

        scanner.close();
    }

    // Method to find and print character frequency
    public static void findFrequency(String text) {
        int[] frequency = new int[256]; // Store character counts

        // Count occurrences of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        // Display unique characters and their frequencies
        System.out.println("\nCharacter | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                System.out.println("   " + (char) i + "      |    " + frequency[i]);
            }
        }
    }
}
