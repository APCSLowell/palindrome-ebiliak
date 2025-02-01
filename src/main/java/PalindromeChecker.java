import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {

    public void tester() {
        // Create a list to store the lines from the file dynamically
        String[] lines = new String[6]; 
        try {
            File myFile = new File("palindromes.txt");
            Scanner myReader = new Scanner(myFile);
            int counter = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                lines[counter] = data;
                counter++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        System.out.println("there are " + lines.length + " lines");

        for (int i = 0; i < lines.length; i++) {
            if (palindrome(lines[i])) {
                System.out.println(lines[i] + " IS a palindrome.");
            } else {
                System.out.println(lines[i] + " is NOT a palindrome.");
            }
        }
    }

    // Method to check if the word is a palindrome
    public boolean palindrome(String word) {
        // Normalize the string: convert to lowercase and remove non-letter characters
        word = word.toLowerCase().replaceAll("[^a-z]", "");

        // Compare the normalized word with its reverse
        return word.equals(reverse(word));
    }

    // Method to reverse the string
    public String reverse(String str) {
        StringBuilder sNew = new StringBuilder(str);
        return sNew.reverse().toString();
    }

    public static void main(String[] args) {
        // Create an instance of PalindromeChecker and call tester() method
        PalindromeChecker checker = new PalindromeChecker();
        checker.tester();
    }
}
