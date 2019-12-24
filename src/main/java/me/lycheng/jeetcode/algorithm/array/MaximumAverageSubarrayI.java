package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/maximum-average-subarray-i/
 */
public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
        double ma = -Double.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            double ca = average(nums, i, i + k);
            if (ca > ma)
                ma = ca;
        }
        return ma;
    }

    private double average(int []nums, int l, int r) {
        double sum = 0;
        for (int i = l; i < r; i++) {
            sum += nums[i];
        }
        return sum / (r - l);
    }
}
