package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 */
public class CountNegativeNumbersInaSortedMatrix {

    public int countNegatives(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        return search(grid, visited, grid.length - 1, grid[0].length - 1);
    }

    private int search(int[][] grid, boolean[][] visited, int i, int j) {
        if (i < 0 || j < 0)
            return 0;

        if (grid[i][j] >= 0 || visited[i][j])
            return 0;

        visited[i][j] = true;
        return 1 + search(grid, visited, i - 1, j) + search(grid, visited, i, j - 1);
    }
}
