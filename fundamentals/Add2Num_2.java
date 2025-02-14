import java.util.*;

public class Add2Num_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number :");
        int num_1 = sc.nextInt();

        System.out.println("Enter your second number :");
        int num_2 = sc.nextInt();

        int sum = num_1 + num_2;
        System.out.println("Sum of 2 numbers :");
        System.out.println(sum);

        sc.close();

    }

}
