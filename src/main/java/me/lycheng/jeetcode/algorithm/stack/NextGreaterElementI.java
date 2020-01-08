package me.lycheng.jeetcode.algorithm.stack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/next-greater-element-i/
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums2.length == 0)
            return new int[] {};
        if (nums2.length == 1)
            return new int[]{-1};

        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        nextGreaterMap.put(nums2[nums2.length - 1], -1);
        for (int i = nums2.length - 2; i >= 0; i--) {
            int a = nums2[i];
            for (int j = i + 1; j < nums2.length; j++) {
                int b = nums2[j];
                if (b > a) {
                    nextGreaterMap.put(a, b);
                    break;
                }

                if (nextGreaterMap.get(b) == -1) {
                    nextGreaterMap.put(a, -1);
                    break;
                }

                if (nextGreaterMap.get(b) > a) {
                    nextGreaterMap.put(a, nextGreaterMap.get(b));
                    break;
                }
            }
        }

        List<Integer> rv = new LinkedList<>();
        for(int i: nums1) {
            rv.add(nextGreaterMap.get(i));
        }
        return rv.stream().mapToInt(i ->i).toArray();
    }
}
