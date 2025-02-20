import java.util.*;
public class Smallest_Largest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //taking inputs..
        System.out.println("Enter three inputs: ");
        int user1=sc.nextInt();
        int user2=sc.nextInt();
        int user3=sc.nextInt();

        //calling the method and printing the results
        int [] result=compare(user1, user2, user3);
        System.out.println("Smallest number is: "+result[0]);
        System.out.println("Largest number is: "+result[1]);
        sc.close();
    }

    //method for comparison between inputs using inbuilt functions
    public static int[] compare(int a, int b, int c){
        int smallest=Math.min(a,Math.min(b,c));
        int largest=Math.max(a,Math.max(b,c));
        return new int[]{smallest,largest};
        
    }
    
}
