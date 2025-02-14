public class FeeCalculation_6 {
    public static void main(String[] args) {

        int fee = 125000;
        int discountper = 10;

        double discount = (fee * discountper) / 100.0; // calculating offer on 10% discount

        double finalFee = fee - discount; // after discount fee

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

    }

}
