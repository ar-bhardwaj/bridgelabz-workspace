import java.util.Scanner;

public class BonusPayout {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        double[] salary = new double[10];
        double[] years = new double[10];
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Loop to take input for salary and years of service
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the salary of employee " + (i + 1));
            salary[i] = sc.nextDouble();

            // Validate salary input
            if (salary[i] <= 0) {
                System.out.println("Please enter a valid salary");
                i--; // Decrement index to retake input
                continue;
            }

            System.out.println("Enter the years of service of employee " + (i + 1));
            years[i] = sc.nextDouble();

            // Validate years of service input
            if (years[i] <= 0) {
                System.out.println("Please enter a valid year of service");
                i--; // Decrement index to retake input
            }
        }

        // Loop to calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i]; // Compute new salary after adding bonus
            totalBonus += bonus[i]; // Accumulate total bonus payout
            totalOldSalary += salary[i]; // Accumulate total salary before bonus
            totalNewSalary += newSalary[i]; // Accumulate total salary after bonus
        }

        System.out.println("The total bonus payout is " + totalBonus);
        System.out.println("The total old salary payout is " + totalOldSalary);
        System.out.println("The total new salary payout is " + totalNewSalary);

        sc.close();
    }
}