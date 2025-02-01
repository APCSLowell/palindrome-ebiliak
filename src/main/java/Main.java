import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        checker.tester();
    }
}

// PalindromeChecker class
class PalindromeChecker {

    public void tester() {
        try {
            File file = new File("palindromes.txt"); // Load file
            Scanner scanner = new Scanner(file);
            
            int lineCount = 0;
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                lineCount++;
            }
            scanner.close();

            System.out.println("there are " + lineCount + " lines");

            scanner = new Scanner(file); // Reopen file for reading
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (palindrome(line)) {
                    System.out.println(line + " IS a palindrome.");
                } else {
                    System.out.println(line + " is NOT a palindrome.");
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: palindromes.txt not found. Please ensure it is in the correct directory.");
        }
    }

    // Checks if a given string is a palindrome
    public boolean palindrome(String word) {
        if (word == null || word.isEmpty()) return false; // Handle empty cases

        // Normalize: Convert to lowercase and remove non-letter characters
        word = word.toLowerCase().replaceAll("[^a-z]", "");

        // Compare the cleaned-up version with its reversed version
        return word.equals(reverse(word));
    }

    // Reverses a string
    public String reverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
