import java.util.Scanner;

public class TrignometricMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking inputs
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        sc.close();
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[] { sin, cos, tan };
    }
}
