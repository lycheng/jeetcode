package me.lycheng.jeetcode.math;

/**
 * https://leetcode.com/problems/projection-area-of-3d-shapes/
 */
public class ProjectionAreaOf3DShapes {

    public int projectionArea(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int lenOfRow = grid.length;
        int lenOfColumn = grid[0].length;
        int res = 0;

        for (int i = 0; i < lenOfRow; i++) {
            res += maxOfRow(grid[i]);
            for (int j = 0; j < lenOfColumn; j++) {
                if (grid[i][j] > 0)
                    res += 1;
            }
        }

        for (int i = 0; i < lenOfColumn; i++) {
            res += maxOfColumn(grid, i);
        }
        return res;
    }

    private int maxOfRow(int[] row) {
        int max = row[0];
        for (int i = 1; i < row.length; i++) {
            max = row[i] < max? max: row[i];
        }
        return max;
    }

    private int maxOfColumn(int[][] grid, int columnIdx) {
        int max = grid[0][columnIdx];
        for (int i = 1; i < grid.length; i++) {
            max = grid[i][columnIdx] < max? max: grid[i][columnIdx];
        }
        return max;
    }
}
