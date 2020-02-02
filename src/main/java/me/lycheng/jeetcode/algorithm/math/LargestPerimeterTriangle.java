package me.lycheng.jeetcode.algorithm.math;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/largest-perimeter-triangle/
 */
public class LargestPerimeterTriangle {

    public int largestPerimeter(int[] A) {
        int rv = 0;
        Arrays.sort(A);

        for (int i = A.length - 1; i >= 2 ; i--) {
            if (A[i] < A[i - 1] + A[i - 2]) {
                rv = A[i] + A[i - 1] + A[i - 2];
                break;
            }
        }
        return rv;
    }
}
