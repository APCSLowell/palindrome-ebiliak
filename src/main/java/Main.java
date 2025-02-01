public class PalindromeChecker {

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
