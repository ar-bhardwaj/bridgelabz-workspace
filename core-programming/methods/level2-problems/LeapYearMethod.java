import java.util.Scanner;

public class LeapYearMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking input as years
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // condition for valid inputs
        if (year <= 1582) {
            System.out.println("Enter a number greater than 1582.");
            sc.close();
            return; // Exits the program
        }
        // stored the method in boolean variable
        boolean check = isLeapYear(year);

        // printing the result using condition
        if (check) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is Not a Leap Year.");
        }

        sc.close();
    }

    // method to check if the input year is leapyear
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}