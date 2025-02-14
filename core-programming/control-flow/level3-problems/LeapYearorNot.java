import java.util.*;

class LeapYearorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");

        int year = sc.nextInt();

        // Check for Gregorian calendar validity
        if (year < 1582) {
            System.out.println("The program only works for years >= 1582.");
        } else {
            // first part using multiple if else
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is NOT a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }
        // second part
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is a Leap Year. (Single If Statement)");
        } else {
            System.out.println(year + " is NOT a Leap Year. (Single If Statement)");
        }
        sc.close();
    }
}