import java.util.*;

public class PowerCalc_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base : ");
        double base = sc.nextDouble();

        System.out.println("Enter the exponent : ");
        double exponent = sc.nextDouble();

        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is : " + result);

        sc.close();

    }

}
