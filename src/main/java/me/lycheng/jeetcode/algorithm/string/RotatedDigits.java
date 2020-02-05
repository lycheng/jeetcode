package me.lycheng.jeetcode.algorithm.string;

/**
 * https://leetcode.com/problems/rotated-digits/
 */
public class RotatedDigits {

    private boolean isGood(int i) {
        String s = String.valueOf(i);
        boolean rv = false;
        for(char c: s.toCharArray()) {
            if (c == '3' || c == '4' || c == '7')
                return false;
            if (c == '2' || c == '5' || c == '6' || c == '9')
                rv = true;
        }
        return rv;
    }

    public int rotatedDigits(int N) {
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (isGood(i))
                cnt += 1;
        }
        return cnt;
    }
}
