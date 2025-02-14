import java.util.*;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find factors: ");
        int factorNum = sc.nextInt();
        int greatestFactor = 1;
        for (int i = factorNum - 1; i > 0; i--) {
            if (factorNum % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor (besides itself): " + greatestFactor);
        sc.close();
    }

}
