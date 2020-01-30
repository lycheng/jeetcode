package me.lycheng.jeetcode.algorithm.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/rank-transform-of-an-array/
 */
public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) {
            return new int[] {};
        }
        int[] sortedArray = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArray);

        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0, rank = 1; i < sortedArray.length; i++) {
            if (rankMap.containsKey(sortedArray[i]))
                continue;
            rankMap.put(sortedArray[i], rank++);
        }

        int[] rv = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rv[i] = rankMap.get(arr[i]);
        }
        return rv;
    }
}
