import java.util.Scanner;

public class NumberFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        String input = scanner.next(); // Reads user input

        //  Calling the method that handles the exception
        handleException(input); // Safely catches and prints an error message

        scanner.close();
    }

    public static void generateException(String text) {
        int number = Integer.parseInt(text); // Throws NumberFormatException if text is not a valid number
        System.out.println("Converted number: " + number);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text); //  May throw an exception
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out
                    .println("NumberFormatException caught! Invalid input: '" + text + "'. Please enter numbers only.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught! An unexpected error occurred.");
        }
    }

}
