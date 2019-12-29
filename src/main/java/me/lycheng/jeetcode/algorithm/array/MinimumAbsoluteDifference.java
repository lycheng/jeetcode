package me.lycheng.jeetcode.algorithm.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/minimum-absolute-difference/
 */
public class MinimumAbsoluteDifference {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> rv = new LinkedList<>();
        Arrays.sort(arr);

        int minDiff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff < minDiff)
                minDiff = diff;
        }

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];
            if (diff != minDiff)
                continue;
            rv.add(Arrays.asList(arr[i - 1], arr[i]));
        }
        return rv;
    }
}
