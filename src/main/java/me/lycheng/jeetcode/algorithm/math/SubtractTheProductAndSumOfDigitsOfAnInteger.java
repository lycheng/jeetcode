package me.lycheng.jeetcode.algorithm.math;

/**
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public int subtractProductAndSum(int n) {
        int p = 1;
        int s = 0;
        while (n > 0) {
            int d = n % 10;
            p = p * d;
            s = s + d;
            n = n / 10;
        }
        return p - s;
    }
}
