package me.lycheng.jeetcode.recursion;

/**
 * https://leetcode.com/problems/n-th-tribonacci-number/
 */
public class NthTribonacciNumber {
    public int tribonacci(int n) {
        if (n == 0)
            return 0;

        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int rv = 1;

        for (int i = 3; i <= n; i++) {
            rv = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = rv;
        }
        return rv;
    }
}
