package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/minimum-time-visiting-all-points/
 */
public class MinimumTimeVisitingAllPoints {

    public int minTimeToVisitAllPoints(int[][] points) {
        int rv = 0;
        if (points.length <= 1) {
            return rv;
        }

        for (int i = 1; i < points.length; i++) {
            rv += Math.max(
                    Math.abs(points[i][0] - points[i - 1][0]),
                    Math.abs(points[i][1] - points[i - 1][1])
            );
        }
        return rv;
    }
}
