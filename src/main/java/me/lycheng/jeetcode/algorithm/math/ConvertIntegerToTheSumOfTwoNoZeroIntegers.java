package me.lycheng.jeetcode.algorithm.math;

/**
 * https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/
 */
public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {

    private int MAX = 100000;

    private boolean isZeroInteger(int n) {
        while (n > 0) {
            if (n % 10 == 0)
                return true;
            n /= 10;
        }
        return false;
    }

    public int[] getNoZeroIntegers(int n) {
        int[] rv = new int[2];
        for (int i = 1; i < MAX; i++) {
            if (isZeroInteger(i) || isZeroInteger(n - i))
                continue;

            rv[0] = i;
            rv[1] = n - i;
            break;
        }
        return rv;
    }
}
