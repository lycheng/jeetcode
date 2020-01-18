package me.lycheng.jeetcode.algorithm.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/shift-2d-grid/
 */
public class Shift2DGrid {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rowLen = grid.length;
        int columnLen = grid[0].length;
        int len = grid.length * grid[0].length;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < columnLen; j++) {
                list.add(grid[i][j]);
            }
        }

        if (k % len != 0) {
            k = k % len;
            Collections.rotate(list, k);
        }

        List<List<Integer>> rv = new LinkedList<>();
        for (int i = 0; i < rowLen; i++) {
            List<Integer> row = new LinkedList<>();
            for (int j = 0; j < columnLen; j++) {
                row.add(list.get(i * columnLen + j));
            }
            rv.add(row);
        }
        return rv;
    }
}
