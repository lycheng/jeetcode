package me.lycheng.jeetcode.array;

/**
 * https://leetcode.com/problems/binary-search/
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        int ret = -1;
        if (nums == null || nums.length == 0) {
            return ret;
        }

        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                ret = m;
                break;
            }

            if (target < nums[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ret;
    }
}