import java.util.*;

public class OddEven_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for (int i = 0; i <= range; i++) {
            if (i % 2 == 0) {
                System.out.println("evens : " + i);
            } else if (i % 2 != 0) {
                System.out.println("odds  : " + i);
            }
        }
        sc.close();
    }

}
