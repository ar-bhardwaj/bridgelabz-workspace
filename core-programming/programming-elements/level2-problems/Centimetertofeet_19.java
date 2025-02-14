import java.util.*;

public class Centimetertofeet_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();

        // Converting height from cm to inches
        double heightiches = heightCm / 2.54;

        // Extracting feet part by dividing inches by 12
        int heightFeet = (int) (heightiches / 12);

        // Finding remaining inches
        heightiches = heightiches % 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is "
                + heightiches);

        sc.close();
    }

}
