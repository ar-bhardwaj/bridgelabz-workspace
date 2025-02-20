import java.util.*;

public class AreaofTriangle_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter base in cm: ");
        double base = sc.nextDouble();

        System.out.println("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        double areaInCm = 0.5 * base * heightCm;
        double areaInches = areaInCm / 6.4516;

        double heightInches = heightCm / 2.54;
        double heightFeet = heightInches / 12;

        System.out.printf("The area of the triangle is %.2f square cm and %.2f square inches\n", areaInCm, areaInches);
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f\n", heightCm, heightFeet,
                heightInches);
        sc.close();
    }

}
