import java.util.*;

public class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Math.random() -> [0,1)
        // Multiply by 900000 → [0, 899999]
        // Add 100000 → [100000, 999999] (always 6 digits)
        return 100000 + (int)(Math.random() * 900000);
    }

    // Method to check if OTPs are unique
    public static boolean areUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            set.add(otp);
        }
        return set.size() == otps.length; // if all unique, sizes match
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otps[i]);
        }

        // Check uniqueness
        if (areUnique(otps)) {
            System.out.println("\n✅ All OTPs are unique!");
        } else {
            System.out.println("\n⚠️ Some OTPs are repeated!");
        }
    }
}
