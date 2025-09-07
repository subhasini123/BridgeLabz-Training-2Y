// Filename: LongestWord.java
import java.util.Scanner;

public class LongestWord {

    // Method to find the longest word
    public static String findLongestWord(String sentence) {
        sentence = sentence.trim(); // remove leading/trailing spaces
        String longestWord = "";
        String word = "";

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                word += ch; // build current word
            }

            if (ch == ' ' || i == sentence.length() - 1) {
                if (word.length() > longestWord.length()) {
                    longestWord = word; // update longest
                }
                word = ""; // reset for next word
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String longestWord = findLongestWord(sentence);

        System.out.println("Longest word in the sentence: " + longestWord);

        sc.close();
    }
}
