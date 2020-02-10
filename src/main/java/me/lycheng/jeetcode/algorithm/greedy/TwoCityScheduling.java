package me.lycheng.jeetcode.algorithm.greedy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-city-scheduling/
 */
public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        int rv = 0;
        int[] diff = new int[costs.length];
        for(int i = 0; i < costs.length; i++) {
            rv += costs[i][0];
            diff[i] = costs[i][1] - costs[i][0];
        }

        Arrays.sort(diff);
        for (int i = 0; i < costs.length / 2; i++) {
            rv = rv + diff[i];
        }
        return rv;
    }
}
