package me.lycheng.jeetcode.algorithm.math;

/**
 * https://leetcode.com/problems/maximum-69-number/
 */
public class Maximum69Number {

    public int maximum69Number (int num) {
        int div = 1;
        while (true) {
            if (num / div < 10)
                break;
            div *= 10;
        }

        int rv = 0;
        while (num > 0) {
            int digit = num / div;
            rv += 9 * div;
            if (digit == 6) {
                rv += num % div;
                break;
            }
            num = num % div;
            div = div / 10;
        }
        return rv;
    }
}
