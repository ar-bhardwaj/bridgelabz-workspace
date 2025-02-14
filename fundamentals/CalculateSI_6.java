import java.util.*;

public class CalculateSI_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter Principle of amount : ");
        double principle = sc.nextDouble();

        System.out.println("Enter Rate of Interest : ");
        double rate = sc.nextInt();

        System.out.println("Enter Time(in years) : ");
        double time = sc.nextInt();

        double simpleinterest = (principle * rate * time) / 100;
        System.out.println("Simple Interest : " + simpleinterest);

        sc.close();
    }

}
