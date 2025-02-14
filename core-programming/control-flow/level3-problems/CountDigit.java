import java.util.*;
public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get integer input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0;  // Initialize digit count

        // Handle case where number is 0 (since it has 1 digit)
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number /= 10;  // Removing last digit
                count++;        // Increasing count
            }
        }

        // Display the number of digits
        System.out.println("Number of digits: " + count);

        sc.close();
    }
    
}
