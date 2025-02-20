import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[2]; // Array to store 5 numbers

        // Taking input for the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nNumber Analysis:");
        // Checking each number for positive, negative, or zero
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even.");
                } else {
                    System.out.println(num + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative.");
            } else {
                System.out.println(num + " is Zero.");
            }
        }

        // Comparing the first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("Comparison of First and Last Elements:");
        if (first == last) {
            System.out.println("First element (" + first + ") is equal to Last element (" + last + ").");
        } else if (first > last) {
            System.out.println("First element (" + first + ") is greater than Last element (" + last + ").");
        } else {
            System.out.println("First element (" + first + ") is less than Last element (" + last + ").");
        }

        scanner.close();
    }
}
