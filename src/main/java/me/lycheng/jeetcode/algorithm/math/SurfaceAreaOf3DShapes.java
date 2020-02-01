package me.lycheng.jeetcode.algorithm.math;

/**
 * https://leetcode.com/problems/surface-area-of-3d-shapes/
 */
public class SurfaceAreaOf3DShapes {

    private int cubeRawSurfaceArea(int n) {
        if (n == 1)
            return 6;
        return 6 + (n - 1) * 4;
    }

    public int surfaceArea(int[][] grid) {
        int rv = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0)
                    continue;
                int rawSurfaceArea = cubeRawSurfaceArea(grid[i][j]);
                if (i != 0 && grid[i - 1][j] != 0)
                    rawSurfaceArea -= Math.min(grid[i][j], grid[i - 1][j]) * 2;
                if (j != 0 && grid[i][j - 1] != 0)
                    rawSurfaceArea -= Math.min(grid[i][j], grid[i][j - 1]) * 2;
                rv += rawSurfaceArea;
            }
        }
        return rv;
    }
}
