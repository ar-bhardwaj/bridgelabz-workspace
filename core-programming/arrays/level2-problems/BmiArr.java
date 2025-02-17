import java.util.Scanner;

public class BmiArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking the user input for number of person
        System.out.println("Enter the number of persons");
        int persons = sc.nextInt();

        // Taking input array for weight,height,bmi and status
        double[] weight = new double[persons];
        double[] height = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];
        for (int i = 0; i < persons; i++) {
            System.out.println("Enter the weight of person " + (i + 1));
            weight[i] = sc.nextDouble();
            System.out.println("Enter the height of person " + (i + 1));
            height[i] = sc.nextDouble();

            // Calculate the Bmi of person
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Checking the Condition
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi[i] >= 24.9 && bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        System.out.println("Person\tWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < persons; i++) {
            System.out.println((i + 1) + "\t" + weight[i] + "\t" + height[i] + "\t" + bmi[i] + "\t" + status[i]);
        }
        sc.close();
    }
}