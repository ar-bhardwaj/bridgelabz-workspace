import java.util.Scanner;

public class SpringSeason {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = scanner.nextInt();

        // Print result
        String result = isSpringSeason(month, day);
        System.out.println(result);

        scanner.close();
    }

    // method to check if the given date falls in the Spring season
    public static String isSpringSeason(int month, int day) {
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            return "is a Spring Season";
        } else {
            return "not a Spring Season";
        }
    }

}
