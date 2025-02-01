public class Main {

    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker();
        checker.tester();  // Call tester method
    }
}

// PalindromeChecker class
class PalindromeChecker {

    // Method to test palindrome functionality with an input file
    public void tester() {
        try {
            // Here, you would load the file containing the phrases to test
            String[] lines = {
                "test", 
                "rotator", 
                "rewriter", 
                "nurses run", 
                "Madam, I'm Adam!", 
                "A Man! A Plan! A Canal! Panama!"
            };

            System.out.println("there are " + lines.length + " lines");

            // Loop through each line and check if it's a palindrome
            for (String line : lines) {
                if (palindrome(line)) {
                    System.out.println(line + " IS a palindrome.");
                } else {
                    System.out.println(line + " is NOT a palindrome.");
                }
            }

        } catch (Exception e) {
            System.out.println("Error: Something went wrong with testing.");
        }
    }

    // Method to check if a word is a palindrome
    public boolean palindrome(String word) {
        if (word == null || word.isEmpty()) return false; // Handle empty or null cases

        // Normalize: Convert to lowercase and remove all non-alphabet characters
        word = word.toLowerCase().replaceAll("[^a-z]", "");

        // Check if the normalized word is equal to its reverse
        return word.equals(reverse(word));
    }

    // Method to reverse a string
    public String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
