
public class OTPwMethod {
    public static void main(String[] args) {

        // made an array to save the OTP numbers generated 10 times
        int otps[] = new int[10];

        System.out.println("Generated otps");
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP(); // elements into array
            System.out.println(otps[i] + " ");
        }

        // printed the result using
        if (uniqueotps(otps)) {
            System.out.println("All are Otps unique");
        } else {
            System.out.println("Duplicate found");
        }

    }

    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    // made a method to check if the numbers are unique or not
    public static boolean uniqueotps(int[] otp) {
        for (int i = 0; i < otp.length; i++) {
            for (int j = i + 1; j < otp.length; j++) {
                if (otp[i] == otp[j]) // compared the elements
                    return false; // duplicate
            }
        }
        return true; // not duplicate
    }
}
