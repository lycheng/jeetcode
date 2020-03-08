package me.lycheng.jeetcode.algorithm.array;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/fair-candy-swap/
 */
public class FairCandySwap {

    public int[] fairCandySwap(int[] A, int[] B) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        int diff = 0;
        for(int i: A) {
            diff += i;
            setA.add(i);
        }

        for(int i: B) {
            diff -= i;
            setB.add(i);
        }

        int[] rv = new int[2];
        for(int i: setA) {
            if (!setB.contains(i - (diff / 2)))
                continue;
            rv[0] = i;
            rv[1] = i - diff / 2;
            break;
        }
        return rv;
    }
}
