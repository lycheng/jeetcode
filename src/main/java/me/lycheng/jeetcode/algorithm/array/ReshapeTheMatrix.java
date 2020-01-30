package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/reshape-the-matrix/
 */
public class ReshapeTheMatrix {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rowCnt = nums.length;
        int colCnt = nums[0].length;
        if (r * c != rowCnt * colCnt)
            return nums;

        int[] arrayToReshape = new int[rowCnt * colCnt];
        for (int i = 0, k = 0; i < rowCnt; i++) {
            for (int j = 0; j < colCnt; j++) {
                arrayToReshape[k++] = nums[i][j];
            }
        }

        int[][] rv = new int[r][c];
        for (int i = 0; i < arrayToReshape.length; i++) {
            rv[i / c][i % c] = arrayToReshape[i];
        }
        return rv;
    }
}
