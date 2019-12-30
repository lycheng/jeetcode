package me.lycheng.jeetcode.algorithm.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/matrix-cells-in-distance-order/
 */
public class MatrixCellsInDistanceOrder {

    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        List<List<Integer>> rv = new LinkedList<>();
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                rv.add(Arrays.asList(i, j));
            }
        }
        rv.sort((a, b) -> {
            int aDist = Math.abs(a.get(0) - r0) + Math.abs(a.get(1) - c0);
            int bDist = Math.abs(b.get(0) - r0) + Math.abs(b.get(1) - c0);
            if (aDist == bDist)
                return 0;
            else
                return aDist < bDist ? -1 : 1;
        });
        return rv.stream().map(integers -> integers.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
    }
}
