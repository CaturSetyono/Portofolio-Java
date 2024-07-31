public class Main {
    public static void main(String[] args) {
        String testString = "Blok";
        boolean result = testPalindrome(testString);
        System.out.println("Apakah \"" + testString + "\" adalah palindrome? " + result);
    }

    public static boolean testPalindrome(String s) {
        String cleanedString = s.replaceAll("[\\W_]", "").toLowerCase();
        return isPalindromeRecursive(cleanedString, 0, cleanedString.length() - 1);
    }

    private static boolean isPalindromeRecursive(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalindromeRecursive(s, left + 1, right - 1);
    }
}
