import java.util.*;

public class SumofNaturalnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input of number
        System.out.println("Enter a natural number: ");
        int number = sc.nextInt();

        int result = sum(number);
        System.out.println("Sum of n natural numbers: " + result);

        sc.close();
    }

    public static int sum(int num) {
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;

        }
        return sum;
    }
}
