package me.lycheng.jeetcode.algorithm.string;

/**
 * https://leetcode.com/problems/remove-palindromic-subsequences/
 */
public class RemovePalindromicSubsequences {
    public int removePalindromeSub(String s) {
        if (s.equals(""))
            return 0;

        boolean isPal = true;
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                isPal = false;
                break;
            }
        }

        if (isPal)
            return 1;
        return 2;
    }
}
