import java.util.*;

public class Until0orNeg_11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double input = sc.nextDouble();

        while (true) {
            input = sc.nextDouble();
            if (input <= 0)
                break;
            total += input;
        }
        System.out.println("Total sum: " + total);

        sc.close();
    }

}