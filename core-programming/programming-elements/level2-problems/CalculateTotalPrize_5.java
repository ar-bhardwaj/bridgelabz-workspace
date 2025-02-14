import java.util.*;

public class CalculateTotalPrize_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter unit price and quantity: ");
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity; // calculating total prize

        System.out.println("Total purchase price is INR " + totalPrice);

        sc.close();
    }
}
