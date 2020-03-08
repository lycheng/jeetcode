package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/duplicate-zeros/
 */
public class DuplicateZeros {

    private void shiftArray(int[] arr, int begin) {
        int last = arr[begin];
        for (int i = begin; i < arr.length - 1; i++) {
            int tmp = arr[i + 1];
            arr[i + 1] = last;
            last = tmp;
        }
    }

    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                continue;
            shiftArray(arr, i);
            i += 1;
        }
    }
}
