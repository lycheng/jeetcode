package me.lycheng.jeetcode.algorithm.array;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int i;
        for (i = 0; i < nums.length; i++) {
            boolean findLarger = false;
            int j;

            for (j = i + 1; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    findLarger = true;
                    break;
                }
            }

            if (!findLarger) {
                break;
            }
            nums[i + 1] = nums[j];
        }
        return i + 1;
    }
}
