package me.lycheng.jeetcode.algorithm.math;

/**
 * https://leetcode.com/problems/largest-triangle-area/
 *
 * References:
 *   - https://massivealgorithms.blogspot.com/2018/04/leetcode-812-largest-triangle-area.html
 */
public class LargestTriangleArea {

    public double largestTriangleArea(int[][] points) {
        double rv = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    double a = area(points[i], points[j], points[k]);
                    if (a > rv)
                        rv = a;
                }
            }
        }
        return rv;
    }

    private double area(int[] p, int[] q, int[] r) {
        int x1 = p[0], y1 = p[1];
        int x2 = q[0], y2 = q[1];
        int x3 = r[0], y3 = r[1];
        return Math.abs(0.5 * (x2 * y3 + x1 * y2 + x3 * y1 - x3 * y2 - x2 * y1 - x1 * y3));
    }
}
