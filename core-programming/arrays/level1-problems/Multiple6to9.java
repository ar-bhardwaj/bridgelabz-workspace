import java.util.Scanner;

public class Multiple6to9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input of arrays size
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Taking an array
        int[] multiplicationResult = new int[number];

        // Iterate and find the multiples from 6 to 9
        for (int i = 6; i <= 9; i++) {
            multiplicationResult[i - 6] = number * i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
        scanner.close();
    }
}