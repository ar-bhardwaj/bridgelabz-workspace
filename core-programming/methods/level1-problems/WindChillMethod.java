import java.util.*;

public class WindChillMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // tking inputs
        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed in mph: ");
        double windSpeed = sc.nextDouble();

        sc.close();
        // called the method
        double windChill = calculateWindChill(temperature, windSpeed);
        // prints the output
        System.out.println("The wind chill temperature is: " + windChill + "°F");
    }

    // method to caculte wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
