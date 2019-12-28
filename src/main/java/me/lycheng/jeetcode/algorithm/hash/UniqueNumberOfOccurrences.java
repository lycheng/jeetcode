package me.lycheng.jeetcode.algorithm.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/unique-number-of-occurrences/
 */
public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> counter = new HashMap<>();
        for(int i: arr) {
            counter.put(i, counter.getOrDefault(i, 0) + 1);
        }

        return counter.keySet().size() == new HashSet<>(counter.values()).size();
    }
}
