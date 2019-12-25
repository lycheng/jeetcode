package me.lycheng.jeetcode.algorithm.string;

/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
public class SplitaStringInBalancedStrings {

    public int balancedStringSplit(String s) {
        int rv = 0;
        int lCnt = 0;
        int rCnt = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                lCnt += 1;
            } else {
                rCnt += 1;
            }

            if (lCnt != rCnt)
                continue;

            rv += 1;
        }
        return rv;
    }
}
