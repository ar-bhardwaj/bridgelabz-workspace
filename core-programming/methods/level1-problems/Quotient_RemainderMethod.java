import java.util.*;
public class Quotient_RemainderMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //taking 2 numbers as inputs
        System.out.println("Enter 2 numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int[]result=findRemainderAndQuotient(num1, num2);
        System.out.println("quotient: "+result[0]);
        System.out.println("remainder: "+result[1]);
        sc.close();
    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient=number/divisor;
        int remainder=number%divisor;
        return new int[]{quotient,remainder};

    }
    
}
