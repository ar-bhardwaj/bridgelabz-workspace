import java.util.Scanner;

public class InputKmtoMiles_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double inputKm = sc.nextDouble();

        // Converting user input as kilometers into miles
        double inputMiles = inputKm / 1.6;
        System.out.println("The total miles is " + inputMiles + " mile for the given " + inputKm + " km");

        sc.close();
    }

}
