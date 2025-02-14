import java.util.Scanner;

public class Ques_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n=sc.nextInt();
        int sumLoop = 0;
        for (int i = 1; i <= n; i++) {
            sumLoop += i;
        }
        System.out.println("Sum using for loop: "+sumLoop);

        sc.close();
    }
    
}
