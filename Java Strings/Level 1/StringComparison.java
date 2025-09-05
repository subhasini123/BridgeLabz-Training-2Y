import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter first string: ");
        String string1 = scanner.next();

        System.out.print("Enter second string: ");
        String string2 = scanner.next();

        // Comparing using charAt()
        boolean resultCharAt = compareUsingCharAt(string1, string2);

        // Comparing using built-in equals()
        boolean resultEquals = string1.equals(string2);

        // Displaying results
        System.out.println("\nComparison using charAt(): " + resultCharAt);
        System.out.println("Comparison using equals(): " + resultEquals);

        // Verifying if both methods give the same result
        if (resultCharAt == resultEquals) {
            System.out.println("✅ Both methods give the same result.");
        } else {
            System.out.println("⚠️ Methods give different results.");
        }

        scanner.close();
    }
}
