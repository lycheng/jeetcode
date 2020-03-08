package me.lycheng.jeetcode.algorithm.string;

/**
 * https://leetcode.com/problems/reverse-only-letters/
 */
public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; ) {
            if (!Character.isLetter(chars[i])) {
                i++;
                continue;
            }

            if (!Character.isLetter(chars[j])) {
                j--;
                continue;
            }

            char t = chars[i];
            chars[i++] = chars[j];
            chars[j--] = t;
        }
        return String.valueOf(chars);
    }
}
