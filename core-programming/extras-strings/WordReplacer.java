import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        //  input sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        // Pword to be replaced
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.next();
        
        // Ask user for the new word
        System.out.print("Enter the new word: ");
        String newWord = scanner.next();
        
        scanner.close();
        
        // Replace the word in the sentence
        String modifiedSentence = sentence.replace(oldWord, newWord);
        
        // Display the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);
    }
}


