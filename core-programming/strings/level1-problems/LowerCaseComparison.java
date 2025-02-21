import java.util.Scanner;

public class LowerCaseComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read full text input

        // Convert to lowercase manually
        String manualLowercase = toLowerCaseManual(input);

        // Convert using built-in method
        String builtInLowercase = input.toLowerCase();

        // Compare both results
        boolean isSame = compareStrings(manualLowercase, builtInLowercase);

        // Display results
        System.out.println("\nManual Conversion: " + manualLowercase);
        System.out.println("Built-in Conversion: " + builtInLowercase);
        System.out.println("Are both results the same? " + isSame);

        scanner.close();
    }

    public static String toLowerCaseManual(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Convert uppercase letters to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32); // ASCII conversion
            }

            result.append(ch);
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

}
