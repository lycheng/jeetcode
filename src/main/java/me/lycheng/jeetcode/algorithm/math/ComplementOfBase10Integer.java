package me.lycheng.jeetcode.algorithm.math;

/**
 * https://leetcode.com/problems/complement-of-base-10-integer/
 */
public class ComplementOfBase10Integer {

    public int bitwiseComplement(int N) {
        if (N == 0)
            return 1;

        int rv = 0;
        int shift = 0;
        while (N > 0) {
            int i = N & 1;
            i = i == 1? 0: 1;
            rv = rv | (i << shift++);
            N = N >> 1;
        }
        return rv;
    }
}
