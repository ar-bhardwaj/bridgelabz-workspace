import java.util.Scanner;

public class StringOutOfBoundsDemo {
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
        System.out.println(text.charAt(text.length())); // Invalid index (out of bounds)
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length())); // Invalid access
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught! Invalid index access.");
        }
    }

}
