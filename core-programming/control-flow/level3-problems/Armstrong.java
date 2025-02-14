import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int number=sc.nextInt();
        int sum=0;
        int oNumber=number;
        while(oNumber!=0){
            int r = oNumber % 10; 
            sum+=r*r*r;
            oNumber/=10;
        }
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
        sc.close();
    }
    
}
