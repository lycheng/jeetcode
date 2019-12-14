package me.lycheng.jeetcode.array;

/**
 * https://leetcode.com/problems/fibonacci-number/
 */
public class FibonacciNumber {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        }

        int m = 0;
        int n = 1;
        for (int i = 3; i <= N; i++) {
            int tmp = m;
            m = n;
            n = tmp + n;
        }
        return m + n;
    }
}
