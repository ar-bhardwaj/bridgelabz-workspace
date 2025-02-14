import java.util.*;

public class Avgof3num_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number : ");
        double num_1 = sc.nextDouble();

        System.out.println("Enter second number : ");
        double num_2 = sc.nextDouble();

        System.out.println("Enter third number : ");
        double num_3 = sc.nextDouble();

        double avg = (num_1 + num_2 + num_3) / 3;
        System.out.println("Average of Three inputs : " + avg);

        sc.close();
    }

}
