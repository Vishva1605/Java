public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "abccba";
        boolean isPalindrome = true;

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                System.out.println("Not a palindrome");
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        }
    }
}
