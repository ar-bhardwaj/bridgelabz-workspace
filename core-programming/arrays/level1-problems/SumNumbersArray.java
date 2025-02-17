import java.util.Scanner;

public class SumNumbersArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10]; 
        double total = 0.0; // Variable to store the sum
        int index = 0; 

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble();

            // Stop if the user enters 0 or a negative number
            if (num <= 0) {
                break;
            }

            // Store the number in the array and increment index
            numbers[index] = num;
            index++;

            // Stop taking inputs if array limit (10 numbers) is reached
            if (index == 10) {
                break;
            }
        }

        // Calculate the sum of all stored numbers
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        // Display the total sum
        System.out.println("Total sum of numbers: " + total);

        scanner.close();
    }
}
