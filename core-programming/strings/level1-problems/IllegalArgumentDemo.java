import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.next(); // Reads a single word

        // Calling the method that handles the exception
        handleException(input); // Safely catches and prints an error message

        scanner.close();
    }

    public static void generateException(String text) {
        System.out.println(text.substring(5, 2)); // Invalid: start index > end index
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2)); // Invalid access
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught! Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught! An unexpected error occurred.");
        }
    }

}
