package me.lycheng.jeetcode.string;

/**
 * https://leetcode.com/problems/repeated-substring-pattern/
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        if (s.length() <= 1)
            return false;

        for (int i = 0; i < s.length() / 2; i++) {
            if (isRepeated(i, s)) {
                return true;
            }
        }
        return false;
    }

    public boolean isRepeated(int endIndex, String s) {
        String sub = s.substring(0, endIndex + 1);
        for (int i = 0; i < s.length(); i += sub.length()) {
            if (s.indexOf(sub, i) != i)
                return false;
        }
        return true;
    }
}
