import java.util.*;

public class KMtoMilesConverter_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in Kilometers : ");
        double kilometer = sc.nextDouble();

        double miles = kilometer * 0.621371;
        System.out.println(kilometer + " Kilometers is equals to " + miles + " miles.");

        sc.close();
    }

}
