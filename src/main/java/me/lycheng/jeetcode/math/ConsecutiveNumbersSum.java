package me.lycheng.jeetcode.math;

/**
 * https://leetcode.com/problems/consecutive-numbers-sum/
 */
public class ConsecutiveNumbersSum {

    public int consecutiveNumbersSum(int N) {
        int res = 0;

        for (int i = 1; ; i++) {
            int j = N - i * (i - 1) / 2;
            if (j <= 0)
                break;

            if (j % i == 0)
                res++;
        }
        return res;
    }
}