import java.util.*;

public class ParameterofRectangle_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Width of the rectangle :");
        int width = sc.nextInt();
        
        System.out.println("Enter Length of the rectangle :");
        int length = sc.nextInt();

        int parameter = 2 * (width + length);
        System.out.println("Parameter of Rectangle is : ");
        System.out.println(parameter);

        sc.close();
    }

}
