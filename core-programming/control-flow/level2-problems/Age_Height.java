import java.util.*;

public class Age_Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age and height of Amar: ");
        int ageA = sc.nextInt(), heightA = sc.nextInt();
        System.out.print("Enter age and height of Akbar: ");
        int ageB = sc.nextInt(), heightB = sc.nextInt();
        System.out.print("Enter age and height of Anthony: ");
        int ageC = sc.nextInt(), heightC = sc.nextInt();

        int youngest = Math.min(ageA, Math.min(ageB, ageC));
        int tallest = Math.max(heightA, Math.max(heightB, heightC));
        System.out.println("Youngest age: " + youngest);
        System.out.println("Tallest height: " + tallest);

        sc.close();
    }

}
