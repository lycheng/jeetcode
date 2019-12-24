package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/toeplitz-matrix/
 */
public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        int j = 0;
        for (int i = matrix.length - 1; i >= 0; i--) {
            if (!isToeplitz(matrix, i, j))
                return false;
        }

        int i = 0;
        for (j = 0; j < matrix[0].length; j++) {
            if (!isToeplitz(matrix, i, j))
                return false;
        }
        return true;
    }

    public boolean isToeplitz(int[][] matrix, int i, int j) {
        int l = j + 1;
        for (int k = i + 1; k < matrix.length && l < matrix[i].length; k++, l++) {
            if (matrix[k][l] == matrix[i][j])
                continue;
            return false;
        }
        return true;
    }
}
