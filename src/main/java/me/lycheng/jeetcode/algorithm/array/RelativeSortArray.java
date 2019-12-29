package me.lycheng.jeetcode.algorithm.array;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/relative-sort-array/
 */
public class RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> restInts = new ArrayList<>();
        Map<Integer, Integer> counter = new HashMap<>();
        Set<Integer> set = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

        for(int i: arr1) {
            if (set.contains(i))
                counter.put(i, counter.getOrDefault(i, 0) + 1);
            else
                restInts.add(i);
        }

        Collections.sort(restInts);
        List<Integer> rv = new LinkedList<>();
        for(int i: arr2) {
            int cnt = counter.get(i);
            for (int j = 0; j < cnt; j++) {
                rv.add(i);
            }
        }
        rv.addAll(restInts);
        return rv.stream().mapToInt(i->i).toArray();
    }
}
