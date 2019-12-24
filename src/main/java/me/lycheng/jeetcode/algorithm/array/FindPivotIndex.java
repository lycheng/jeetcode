package me.lycheng.jeetcode.algorithm.array;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        int[] sumOfLeft = new int[nums.length];
        int[] sumOfRight = new int[nums.length];

        sumOfLeft[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            sumOfLeft[i] = sumOfLeft[i - 1] + nums[i - 1];
        }

        sumOfRight[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            sumOfRight[i] = sumOfRight[i + 1] + nums[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (sumOfLeft[i] == sumOfRight[i]) {
                return i;
            }
        }
        return -1;
    }
}