import java.util.*;

public class SideofSquare_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // tling user inputs of perimeter of square
        System.out.println("Enter perimeter of the square: ");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        sc.close();
    }

}
