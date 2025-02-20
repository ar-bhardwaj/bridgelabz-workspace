import java.util.Scanner;

public class SumComparisionUsingRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inputs from the user
        System.out.print("Enter a natural number: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Invalid input! Please enter a natural number (n > 0).");
            sc.close();
            return;
        }
        // stored the sum method in recursivesum
        int recursiveSum = sum(num);

        // stored the sumUsingFormula in formula sum
        int formulaSum = sumUsingFormula(num);

        // printed the value
        System.out.println("\nSum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // compared the result of both the methods
        if (recursiveSum == formulaSum) {
            System.out.println("Both computations match. The result is correct!");
        } else {
            System.out.println("Mismatch in results. There is an error in computation.");
        }

        sc.close();
    }

    // made a method to print sum using recursive method
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    // a method to print sum using normal formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

}
