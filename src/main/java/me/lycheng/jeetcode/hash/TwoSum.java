package me.lycheng.jeetcode.hash;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/two-sum/description/
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] rv = new int[2];

        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                rv[0] = i;
                rv[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }
        return rv;
    }
}
