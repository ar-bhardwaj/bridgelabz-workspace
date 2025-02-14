import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        double num_1 = sc.nextDouble();

        System.out.print("Enter second number : ");
        double num_2 = sc.nextDouble();

        float add = (float) (num_1 + num_2);
        float sub = (float) (num_1 - num_2);
        float multiply = (float) (num_1 * num_2);
        float division = (float) (num_1 / num_2);

        System.out.print("The addition, subtraction, multiplication and division value of 2 numbers " + num_1 + " and "
                + num_2 + " is " + add + " , " + sub +" , "+ multiply + " , " + " and , " + division);

        sc.close();
    }

}
