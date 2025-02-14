import java.util.*;

public class DoubleOperations_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three double values x, y, and z: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        // Double operations
        double operation1 = x + y * z;
        double operation2 = x * y + z;
        double operation3 = z + x / y;
        double operation4 = x % y + z;

        System.out.println("The results of Int Operations are " + operation1 + " , " + operation2 + " , " + operation3
                + " and " + operation4);

        sc.close();

    }

}
