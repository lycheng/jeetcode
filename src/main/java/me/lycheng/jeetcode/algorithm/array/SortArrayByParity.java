package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length - 1;
        while (left < right) {
            if ((A[left] & 1) == 0) {
                left++;
                continue;
            }

            if ((A[right] & 1) == 1) {
                right--;
                continue;
            }

            int tmp = A[left];
            A[left] = A[right];
            A[right] = tmp;

            left++;
            right--;
        }
        return A;
    }
}
