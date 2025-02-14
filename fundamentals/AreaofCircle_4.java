import java.util.*;

public class AreaofCircle_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the radius of the Circle : ");
        double radius = sc.nextInt();
        
        float area = (float) (Math.PI * Math.pow(radius, 2));
        System.out.println("The area of Circle is : " + area);
        
        sc.close();
    }

}
