import java.util.Scanner;

public class PercentageArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for the number of students
        System.out.println("Enter the number of students:");
        int students = sc.nextInt();

        // 2D array to store marks for Physics, Chemistry, and Maths
        double[][] marks = new double[students][3];
        double[] percentages = new double[students];
        String[] grades = new String[students];

        // Input loop for student marks
        for (int i = 0; i < students; i++) {
            System.out.println("\nStudent " + (i + 1) + " Marks Entry:");
            marks[i][0] = getValidMarks(sc, "Physics");
            marks[i][1] = getValidMarks(sc, "Chemistry");
            marks[i][2] = getValidMarks(sc, "Maths");

            // Calculate percentage
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            // Assign grades based on percentage
            grades[i] = getGrade(percentages[i]);
        }

        // Display results
        System.out.println("\n---------------------------------------------------");
        System.out.println("Student Physics Chemis  Maths  Percentage   Grade");
        System.out.println("-----------------------------------------------------");


        // System.out.println("\nStudent\tPhysics\t Chemistry\t Maths\t Percentage\t Grade");
         for (int i = 0; i < students; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%.2f%%\t\t%s%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        sc.close(); // Close the scanner
    }

    // Method to get valid marks (positive values only)
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