package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 */
public class CellsWithOddValuesInaMatrix {

    public int oddCells(int n, int m, int[][] indices) {
        int[][] matrix = new int[n][m];
        int rv = 0;

        for (int[] pair : indices) {
            for (int i = 0; i < m; i++) {
                matrix[pair[0]][i] += 1;
                if (matrix[pair[0]][i] % 2 == 1)
                    rv += 1;
                else
                    rv -= 1;
            }
            for (int i = 0; i < n; i++) {
                matrix[i][pair[1]] += 1;
                if (matrix[i][pair[1]] % 2 == 1)
                    rv += 1;
                else
                    rv -= 1;
            }
        }
        return rv;
    }
}
