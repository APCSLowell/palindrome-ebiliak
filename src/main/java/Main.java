public class Main {
    public static void main(final String[] args) {
        PalindromeChecker sim = new PalindromeChecker();
        sim.tester();
    }
}

// PalindromeChecker class to handle palindrome checking
class PalindromeChecker {

    // Reads file and checks palindromes
    public void tester() {
        String[] lines = loadStrings("palindromes.txt"); // Load from file

        // Handle missing file error
        if (lines == null) { 
            System.out.println("⚠️ Error: File not found! Place palindromes.txt in the data folder.");
            return;
        }

        System.out.println("✅ There are " + lines.length + " lines in the file.");

        for (String line : lines) {
            if (isPalindrome(line)) {
                System.out.println("✅ " + line + " IS a palindrome.");
            } else {
                System.out.println("❌ " + line + " is NOT a palindrome.");
            }
        }
    }

    // Checks if a given string is a palindrome
    public boolean isPalindrome(String word) {
        if (word == null || word.isEmpty()) return false; // Handle empty cases

        // Normalize: Convert to lowercase and remove all non-letters
        word = word.toLowerCase().replaceAll("[^a-z]", "");

        // Compare original vs reversed string
        return word.equals(reverse(word));
    }

    // Reverses a string
    public String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
}
