import java.util.*;

public class SumofNaturalnum_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n > 0) {
            int sumFormula = n * (n + 1) / 2;
           
            System.out.println("Sum using formula: " + sumFormula);
        }
        sc.close();
    }

}
