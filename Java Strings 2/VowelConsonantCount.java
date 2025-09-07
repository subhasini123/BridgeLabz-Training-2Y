
import java.util.Scanner;

public class VowelConsonantCount {

    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        text = text.toLowerCase(); // convert to lowercase to simplify comparison

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') { // check only alphabets
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] result = countVowelsAndConsonants(input);

        System.out.println("Number of vowels: " + result[0]);
        System.out.println("Number of consonants: " + result[1]);

        sc.close();
    }
}
