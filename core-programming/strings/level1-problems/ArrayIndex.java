import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define an array of names
        String[] names = { "Alice", "Bob", "Charlie", "David", "Emma" };

        // Take user input for the index
        System.out.print("Enter an index to access (0 - " + (names.length - 1) + "): ");
        int index = scanner.nextInt(); // Reads user input

        // Calling the method that handles the exception
        handleException(names, index); // Safely catches and prints an error message

        scanner.close();
    }

    public static void generateException(String[] names, int index) {
        System.out.println("Accessing index " + index + ": " + names[index]); // May throw an exception
    }

    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Accessing index " + index + ": " + names[index]); // May throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught! Invalid index: " + index);
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught! An unexpected error occurred.");
        }
    }

}
