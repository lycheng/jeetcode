package me.lycheng.jeetcode.algorithm.array;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/monotonic-array/
 */
public class MonotonicArray {

    public boolean isMonotonic(int[] A) {
        if (A.length <= 1)
            return true;

        int flag = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1])
                flag = flag | 1;
            else if (A[i] < A[i - 1])
                flag = flag | 2;
            else
                continue;

            if (flag == 3)
                return false;
        }
        return true;
    }
}
