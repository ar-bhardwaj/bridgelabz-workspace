import java.util.*;

public class Bonus_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years: ");
        double years = sc.nextDouble();
        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus: " + bonus);

        } else {
            System.out.println("not applicable for bonus");
        }

        sc.close();
    }

}
