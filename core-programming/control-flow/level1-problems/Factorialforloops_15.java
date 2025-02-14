import java.util.*;

public class Factorialforloops_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int num = sc.nextInt();
        if (num >= 0) {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("factorial of the positive integer is: " + factorial);
        }

        sc.close();
    }

}