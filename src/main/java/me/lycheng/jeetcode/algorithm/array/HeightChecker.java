package me.lycheng.jeetcode.algorithm.array;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/height-checker/
 */
public class HeightChecker {

    public int heightChecker(int[] heights) {
        if (heights.length <= 1) {
            return 0;
        }
        int[] src = heights.clone();
        Arrays.sort(heights);

        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            if (src[i] == heights[i]) {
                continue;
            }
            res += 1;
        }
        return res;
    }
}
