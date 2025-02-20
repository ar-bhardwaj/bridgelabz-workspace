import java.util.*;

public class NumberAnalysisMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input for integer
        System.out.println("Enter an integer number: ");
        int num = sc.nextInt();

        // calling method
        int result = checknumber(num);
        System.out.println(result);

        sc.close();
    }

    // made method and checked the conditions and return the value accordingly
    public static int checknumber(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 0;
        } else {
            return 1;
        }

    }

}
