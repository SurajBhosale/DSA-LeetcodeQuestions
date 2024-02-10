package Strings;

class PalindromeSubstring {
    // O(n^3)
    // static boolean isPalindrome(String s, int i, int j) {
    // while (i <= j) {
    // if (s.charAt(j) != s.charAt(i)) {
    // return false;
    // }
    // i++;
    // j--;
    // }
    // return true;
    // }

    // static int countSubstrings(String s) {
    // int count = 0;
    // for (int i = 0; i < s.length(); i++) {
    // for (int j = i; j < s.length(); j++) {
    // if (isPalindrome(s, i, j)) {
    // count++;
    // }
    // }
    // }
    // return count;
    // }

    public static int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int even = countPalindrome(s, i, i);
            int odd = countPalindrome(s, i, i + 1);
            ans += even + odd + 1;
        }
        return ans;
    }

    private static int countPalindrome(String s, int left, int right) {
        int cnt = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            cnt++;
            left--;
            right++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }

}