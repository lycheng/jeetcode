package me.lycheng.jeetcode.dp;

/*
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        boolean[][] isPalindromic = new boolean[s.length()][s.length()];

        int left = 0;
        int right = 0;
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                isPalindromic[j][i] = (s.charAt(i) == s.charAt(j) && (i - j < 2 || isPalindromic[j + 1][i - 1]));
                if (isPalindromic[j][i] && len < i - j + 1) {
                    left = j;
                    right = i;
                    len = right - left + 1;
                }
            }
            isPalindromic[i][i] = true;
        }
        return s.substring(left, right + 1);
    }
}