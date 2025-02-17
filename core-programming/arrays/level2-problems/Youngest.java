
import java.util.Scanner;

public class Youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        String[] friends = { "Amar", "Akbar", "Anthony" };
        int[] ages = new int[3];
        double[] heights = new double[3];
        for (int i = 0; i < friends.length; i++) {
            System.out.println("Enter the age of " + friends[i]);
            ages[i] = sc.nextInt();
            System.out.println("Enter the height of " + friends[i]);
            heights[i] = sc.nextDouble();
        }

        // Inatilise the age & height
        int youngest = ages[0];
        double tallest = heights[0];
        for (int i = 1; i < friends.length; i++) {
            if (ages[i] < youngest) {
                youngest = ages[i];
            }
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        System.out.println("The youngest friend is " + friends[youngest] + " with age " + youngest);
        System.out.println("The tallest friend is " + friends[(int) tallest] + " with height " + tallest);
        sc.close();
    }
}