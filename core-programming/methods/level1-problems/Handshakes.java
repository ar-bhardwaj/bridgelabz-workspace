import java.util.*;
public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input for number of students
        System.out.println("Enter no. of students: ");
        int n=sc.nextInt();

        //called the method and printed the maximum no of handshakes
        int result=calculation(n);
        System.out.println("the maximum number of handshakes among "+n+" students is "+result);

        sc.close();

    }
    public static int calculation(int number){
        int handshakes=(number*(number-1))/2;
        return handshakes;
    }
    
}
