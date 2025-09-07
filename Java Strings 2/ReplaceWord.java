// Filename: ReplaceWord.java
import java.util.Scanner;

public class ReplaceWord {

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        String word = "";

        for (int i = 0; i <= sentence.length(); i++) {
            char ch = (i < sentence.length()) ? sentence.charAt(i) : ' '; // add extra space at end

            if (ch != ' ') {
                word += ch; // build current word
            }

            if (ch == ' ' || i == sentence.length()) {
                if (word.equals(oldWord)) {
                    result += newWord; // replace oldWord with newWord
                } else {
                    result += word; // keep the word unchanged
                }

                if (i < sentence.length()) {
                    result += " "; // add space between words
                }
                word = ""; // reset for next word
            }
        }

        return result.trim(); // remove trailing space
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter the new word: ");
        String newWord = sc.next();

        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        System.out.println("Modified Sentence: " + modifiedSentence);

        sc.close();
    }
}
