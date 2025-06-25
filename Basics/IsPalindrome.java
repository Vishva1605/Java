public class IsPalindrome {
    public static void main(string[] args) {
        Solution sol = new Solution();
        int x = 121;
        System.out.println(sol.isPalindrome(x)); // Output: true
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversed = 0;
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }
}
