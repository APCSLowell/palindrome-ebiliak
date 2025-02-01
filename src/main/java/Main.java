public class PalindromeChecker {

    public static void main(String[] args) {
        // Sample test cases
        PalindromeChecker checker = new PalindromeChecker();
        checker.tester();
    }

    public void tester() {
        String[] lines = {
            "test",
            "rotator",
            "rewriter",
            "nurses run",
            "Madam, I'm Adam!",
            "A Man! A Plan! A Canal! Panama!"
        };

        System.out.println("there are " + lines.length + " lines");

        for (String line : lines) {
            if (palindrome(line)) {
                System.out.println(line + " IS a palindrome.");
            } else {
                System.out.println(line + " is NOT a palindrome.");
            }
        }
    }

    // Method to check if a word is a palindrome
    public boolean palindrome(String word) {
        // Normalize: Convert to lowercase and remove all non-letter characters
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
