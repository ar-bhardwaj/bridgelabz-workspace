import java.util.*;

class CalulateSimpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking user inputs for principle,rate and time

        System.out.println("Enter principle amount: ");
        double principle = sc.nextDouble();

        System.out.println("Enter rate (int percentage): ");
        double rate = sc.nextDouble();

        System.out.println("Enter time (in years): ");
        double time = sc.nextDouble();

        //called method in main method
        double result = simpleinterest(principle, rate, time);
        System.out.println("The Simple Interest is "+result+ " for Principal "+principle+" , Rate of Interest "+rate+" and Time "+time+".");
       // System.out.print(result);

        sc.close();
    }

    //made method to calculate SI
    public static double simpleinterest(double p, double rate, double time) {
        double simpleinterest = p * rate * time / 100;
        return simpleinterest;

    }
}