import java.util.*;

public class FeettoYardsnMiles_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        double distanceInYards = distanceInFeet / 3; // coverting feets in yards

        double distanceInMiles = distanceInYards / 1760; // converting yards in miles

        System.out.println("Distance in yards: " + distanceInYards);
        System.out.println("Distance in miles: " + distanceInMiles);

        sc.close();
    }

}
