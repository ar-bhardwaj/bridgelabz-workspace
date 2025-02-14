import java.util.*;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weightKg=sc.nextDouble();
        double heightCm=sc.nextDouble();
        double heightMeter=heightCm/100;
        double bmi=weightKg/(heightMeter*heightMeter);

        String category;
        if(bmi<=18.4){
            category="Underwieght";
        }else if (bmi >= 18.5 && bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obese";
        }
        System.out.printf("Your BMI is: %.2f", bmi);
        System.out.println("Weight Status: " + category);
    
        sc.close();
    }
    
}
