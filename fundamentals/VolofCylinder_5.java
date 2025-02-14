import java.util.*;

public class VolofCylinder_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of Cylinder : ");
        double radius = sc.nextDouble();

        System.out.println("Enter the height of Cylinder : ");
        double height = sc.nextDouble();

        float volume = (float) (Math.PI * Math.pow(radius, 2) * height);
        System.out.println("Volume of Cylinder is : " + volume);

        sc.close();
    }

}
