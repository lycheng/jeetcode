package me.lycheng.jeetcode.algorithm.array;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/decompress-run-length-encoded-list/
 */
public class DecompressRunLengthEncodedList {

    public int[] decompressRLElist(int[] nums) {
        List<Integer> rv = new LinkedList<>();
        for (int i = 1; i < nums.length; i += 2) {
            int freq = nums[i - 1];
            int val = nums[i];

            for (int j = 0; j < freq; j++) {
                rv.add(val);
            }
        }
        return rv.stream().mapToInt(i -> i).toArray();
    }
}
