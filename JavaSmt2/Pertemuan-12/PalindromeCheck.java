public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "A man, a plan, a canal, Panama";
        boolean result = isPalindrome(input);
        System.out.println("Is the input string a palindrome? " + result);
    }

    public static boolean isPalindrome(String str) {
        // Convert the string to lowercase and remove non-alphanumeric characters
        String cleanedStr = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0;
        int right = cleanedStr.length() - 1;

        while (left < right) {
            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
