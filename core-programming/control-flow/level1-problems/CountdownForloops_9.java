import java.util.*;

public class CountdownForloops_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown start value: ");
        int counter = sc.nextInt();

        for (int i = counter; i >= 1; i--) {

            System.out.println(i);

        }
        System.out.println("Liftoff!");

        sc.close();
    }

}
