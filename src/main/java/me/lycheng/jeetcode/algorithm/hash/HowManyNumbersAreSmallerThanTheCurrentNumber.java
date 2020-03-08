package me.lycheng.jeetcode.algorithm.hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] rv = new int[nums.length];
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        Map<Integer, Integer> counter = new HashMap<>();
        counter.put(sorted[0], 0);
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] > sorted[i - 1])
                counter.put(sorted[i], i);
            else
                counter.put(sorted[i], counter.get(sorted[i - 1]));
        }
        for (int i = 0; i < nums.length; i++) {
            rv[i] = counter.get(nums[i]);
        }
        return rv;
    }
}
