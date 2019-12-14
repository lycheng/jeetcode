package me.lycheng.jeetcode.array;

/**
 * https://leetcode.com/problems/transpose-matrix/
 */
public class TransposeMatrix {

    public int[][] transpose(int[][] A) {

        int lenOfRow = A.length;
        int lenOfColumn = A[0].length;
        int[][] res = new int[lenOfColumn][lenOfRow];

        for (int i = 0; i < lenOfRow; i++) {
            for (int j = 0; j < lenOfColumn; j++) {
                res[j][i] = A[i][j];
            }
        }
        return res;
    }
}
