package me.lycheng.jeetcode.array;

/**
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/
 */
public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }

        int first = nums[0] > nums[1]? 0: 1;
        int second = nums[0] > nums[1]? 1: 0;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] < nums[second])
                continue;

            if (nums[i] > nums[second])
                second = i;

            if (nums[second] > nums[first]) {
                int temp = first;
                first = second;
                second = temp;
            }
        }

        if (nums[first] >= nums[second] * 2)
            return first;
        return -1;
    }
}
