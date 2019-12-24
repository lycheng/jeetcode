package me.lycheng.jeetcode.algorithm.math;

/**
 * https://leetcode.com/problems/smallest-range-i/
 */
public class SmallestRangeI {

    public int smallestRangeI(int[] A, int K) {
        int max = A[0];
        int min = A[0];

        for (int i = 0; i < A.length; i++) {
            if (A[i] > max) max = A[i];
            else if (A[i] < min) min = A[i];
        }

        if (max - min <= 2 * K)
            return 0;

        return max - min - 2 * K;
    }
}
