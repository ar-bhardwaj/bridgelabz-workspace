import java.util.*;

public class AreaofTriangle_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base and height of the triangle: ");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double area = 0.5 * base * height;
        System.out.println("Area of the triangle: " + area + " square units");

        sc.close();
    }

}
