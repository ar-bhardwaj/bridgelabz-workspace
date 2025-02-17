import java.util.Scanner;

public class FrequencyArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for number
        System.out.println("Enter the number:");
        int number = sc.nextInt();
        sc.close(); // Close scanner to prevent resource leak

        // Frequency array to store count of digits (0-9)
        int[] frequency = new int[10];

        // Handle case when number is 0
        if (number == 0) {
            frequency[0] = 1;
        } else {
            // Extract digits and update frequency array
            int temp = Math.abs(number); // Handle negative numbers
            while (temp > 0) {
                int digit = temp % 10;
                frequency[digit]++;
                temp /= 10;
            }
        }

        // Display frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " occurs " + frequency[i] + " times");
            }
        }
    }
}