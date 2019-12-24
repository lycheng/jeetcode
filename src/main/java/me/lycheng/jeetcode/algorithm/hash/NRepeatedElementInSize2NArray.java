package me.lycheng.jeetcode.algorithm.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 */
public class NRepeatedElementInSize2NArray {

    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int i: A) {
            if (set.contains(i)) {
                return i;
            }
            set.add(i);
        }
        return -1;
    }
}
