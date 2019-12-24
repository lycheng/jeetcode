package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 */
public class SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int[] evens = new int[A.length / 2];
        int[] odds = new int[A.length / 2];

        for (int i = 0, evenIndex = 0, oddIndex = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                evens[evenIndex++] = A[i];
            } else {
                odds[oddIndex++] = A[i];
            }
        }

        int[] res = new int[A.length];
        for (int i = 0, evenIndex = 0, oddIndex = 0; i < res.length; i++) {
           if (i % 2 == 0) {
               res[i] = evens[evenIndex++];
           } else {
               res[i] = odds[oddIndex++];
           }
        }
        return res;
    }
}
