
import java.util.Scanner;

public class Twod_percentage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of students
        System.out.println("Enter the number of students:");
        int students = sc.nextInt();

        // 2D array for storing marks (Physics, Chemistry, Maths)
        double[][] marks = new double[students][3];
        double[] percentages = new double[students];
        String[] grades = new String[students];

        String[] subjects = { "Physics", "Chemistry", "Maths" }; // Subject names for iteration

        // Loop to take input and compute percentage & grades
        for (int i = 0; i < students; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            // Input marks for each subject
            for (int j = 0; j < 3; j++) {
                marks[i][j] = getValidMarks(sc, subjects[j]);
            }

            // Compute percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            // Assign grades based on percentage
            grades[i] = getGrade(percentages[i]);
        }

        // Display the student details
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < students; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%.2f%%\t\t%s%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

    }

    // Method to get valid marks (between 0 and 100)
    private static double getValidMarks(Scanner sc, String subject) {
        double marks;
        do {
            System.out.println("Enter marks for " + subject + " (0-100):");
            marks = sc.nextDouble();
            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
            }
        } while (marks < 0 || marks > 100);
        return marks;
    }

    // Method to determine grade based on percentage
    private static String getGrade(double percentage) {
        if (percentage >= 90)
            return "A";
        else if (percentage >= 80)
            return "B";
        else if (percentage >= 70)
            return "C";
        else if (percentage >= 60)
            return "D";
        else if (percentage >= 50)
            return "E";
        else
            return "F";
    }
}