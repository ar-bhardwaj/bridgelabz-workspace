import java.util.*;

public class FactorialWhileloops_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");

        int factNum = sc.nextInt();
        if (factNum >= 0) {
            int factorial = 1;
            int i = 1;
            while (i <= factNum) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial using while loop: " + factorial);
        }
        sc.close();
    }

}
