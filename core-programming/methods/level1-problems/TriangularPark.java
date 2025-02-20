import java.util.*;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking inputs for 3 sides of trinangle
        System.out.println("Enter three sides of triangle: ");
        double side1=sc.nextInt();
        double side2=sc.nextInt();
        double side3=sc.nextInt();

        //decalared distance in km as given
        double distance=5.0;

        int result=calculateRounds(side1,side2,side3,distance);
        System.out.println("No. of rounds athelete completes: "+result );

        sc.close();
    }

         // method to calculate the number of rounds
        public static int calculateRounds(double s1, double s2, double s3, double distance) {

            // convert meters to kilometers

            double perimeter = (s1 + s2 + s3) / 1000; 
            int rounds =  (int) (distance / perimeter); // 5 km total run
            
            return rounds;
        
    }

}
