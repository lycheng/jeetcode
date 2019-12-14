package me.lycheng.jeetcode.string;

/*
 * https://leetcode.com/problems/longest-common-prefix/description/
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for (String str: strs) {
            minLen = minLen < str.length()? minLen: str.length();
        }

        int prefixIndex = 0;
        for (int i = 0; i < minLen; i++) {
            char c = strs[0].charAt(i);
            boolean notMatch = false;
            for (String str : strs) {
                if (c != str.charAt(i)) {
                    notMatch = true;
                    break;
                }
            }
            if (notMatch) {
                break;
            }
            prefixIndex = i + 1;
        }
        return strs[0].substring(0, prefixIndex);
    }
}
