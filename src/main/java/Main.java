public class Main {

    public static void main(final String[] args) {
        PalindromeChecker checker = new PalindromeChecker();

        // Sample test cases (for debugging)
        System.out.println(checker.isPalindrome("rotator")); // Expected: true
        System.out.println(checker.isPalindrome("test"));    // Expected: false
        System.out.println(checker.isPalindrome("A man, a plan, a canal, Panama!")); // Expected: true
    }
}

// PalindromeChecker class
class PalindromeChecker {

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
        return new StringBuilder(str).reverse().toString();
    }
}
