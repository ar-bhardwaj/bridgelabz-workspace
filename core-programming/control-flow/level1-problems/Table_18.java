import java.util.*;
public class Table_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int j = 6; j <= 9; j++) {
            System.out.println(num + " * " + j + " = " + (num * j));
        }
        sc.close();
    }
    
}
