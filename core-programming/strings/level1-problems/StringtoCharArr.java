import java.util.*;

public class StringtoCharArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();

        // getting character from userdefined method
        char[] charmethod = getcharacters(input);

        // getting character from built-in method
        char[] builtinmethod = input.toCharArray();

        //compared both the arrays
        boolean comparebothmethods = comparechars(charmethod, builtinmethod);
        System.out.println("both the methods are giving the same result? \n" + comparebothmethods);

        sc.close();
    }

    // Method to return characters without using toCharArray()
    public static char[] getcharacters(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean comparechars(char[] str1, char[] str2) {
        if (str1.length != str2.length) { // Arrays must be of the same length
            return false;
        }
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }
}
