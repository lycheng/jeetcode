package me.lycheng.jeetcode.math;

/*
 * https://leetcode.com/problems/palindrome-number/description/
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String digits = String.valueOf(x);
        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) != digits.charAt(digits.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
