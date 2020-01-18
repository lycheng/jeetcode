package me.lycheng.jeetcode.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
 */
public class P1287 {

    public int findSpecialInteger(int[] arr) {
        int threshold = arr.length / 4;
        Map<Integer, Integer> counter = new HashMap<>();
        for(int val: arr) {
            int cnt = counter.getOrDefault(val, 0) + 1;
            if (cnt > threshold)
                return val;
            counter.put(val, cnt);
        }
        return -1;
    }
}
