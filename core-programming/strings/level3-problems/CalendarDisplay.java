import java.util.Scanner;

public class CalendarDisplay {

    // Returns the name of the month given a number (1-12)
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1]; // Adjust index as array starts from 0
    }

    // Checks if a given year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Returns the number of days in the given month and year
    public static int getDaysInMonth(int month, int year) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        // February has 29 days in a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1]; // Return the correct number of days
    }

    // Calculates the day of the week the month starts on (0 = Sunday, 1 = Monday,
    // ..., 6 = Saturday)
    public static int getFirstDayOfMonth(int month, int year) {
        int d = 1; // First day of the month
        int y = year;
        int m = month;

        // Adjust calculations for January and February
        if (m < 3) {
            y--;
            m += 12;
        }

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        return d0; // Return the starting weekday index
    }

    // Displays the calendar for a given month and year
    public static void printCalendar(int month, int year) {
        System.out.println("\n   " + getMonthName(month) + " " + year); // Print the month and year
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat"); // Print the day headers

        int firstDay = getFirstDayOfMonth(month, year); // Find the first weekday of the month
        int daysInMonth = getDaysInMonth(month, year); // Get total days in the month

        // Print spaces before the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // Print empty spaces for alignment
        }

        // Print all the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day); // Print each day with spacing
            if ((day + firstDay) % 7 == 0 || day == daysInMonth) { // Move to a new line after Saturday
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for month and year
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Check if input values are valid
        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Invalid input! Please enter a valid month (1-12) and a positive year.");
        } else {
            printCalendar(month, year); // Display the calendar
        }

        scanner.close(); // Close the scanner
    }
}
