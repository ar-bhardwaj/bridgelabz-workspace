import java.util.*;

public class InputfeeDiscount_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fee amount: ");
        double inputFee = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double inputDiscountper = sc.nextDouble();

        // Calculating discount based on user input
        double inputDiscount = (inputFee * inputDiscountper) / 100.0;

        double inputFinalFee = inputFee - inputDiscount;
        System.out.print(
                "The discount amount is INR " + inputDiscount + " and final discounted fee is INR " + inputFinalFee);

        sc.close();
    }

}
