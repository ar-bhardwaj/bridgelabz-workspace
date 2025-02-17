import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        // Find the count of digits
        int count = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Store digits in an array
        int[] digits = new int[count];
        int index = 0;
        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // Display the reverse of the number
        System.out.println("The reverse of the number is");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        sc.close();

    }
}