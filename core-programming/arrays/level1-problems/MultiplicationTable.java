import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] table = new int[number]; // Array to store multiplication results

        // Calculate multiplication table and store in the array
        for (int i = 0; i < number; i++) {
            table[i] = number * (i + 1);
        }

        // Display multiplication table
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 0; i < number; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        scanner.close();
    }
}
