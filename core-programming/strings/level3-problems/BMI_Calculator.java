import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2]; // 2D array to store height (cm) and weight (kg)
        
        //  Take user input for height and weight of 10 members
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble(); // Store weight
            
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble(); // Store height
        }

        //  Calculate BMI and status
        String[][] results = calculateBMI(data);
        
        //  Display the results
        displayResults(results);
        
        scanner.close();
    }

    // Method to calculate BMI and status
    public static String[][] calculateBMI(double[][] data) {
        String[][] results = new String[10][4]; // Stores height, weight, BMI, and status

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters); // BMI formula

            results[i][0] = String.format("%.2f", weight); // Store weight
            results[i][1] = String.format("%.2f", data[i][1]); // Store height
            results[i][2] = String.format("%.2f", bmi); // Store BMI
            results[i][3] = getStatus(bmi); // Get BMI status
        }
        return results;
    }

    // Method to determine BMI status based on BMI value
    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal weight";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    // Method to display results in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("\nBMI Results:");
        System.out.println("Weight (kg) | Height (cm) | BMI  | Status");
        for (String[] result : results) {
            System.out.println(result[0] + "         | " + result[1] + "       | " + result[2] + "  | " + result[3]);
        }
    }
}
