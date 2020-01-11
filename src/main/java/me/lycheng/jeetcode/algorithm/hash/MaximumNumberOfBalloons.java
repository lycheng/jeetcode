package me.lycheng.jeetcode.algorithm.hash;

import java.util.*;
import java.util.stream.Stream;

/**
 * https://leetcode.com/problems/maximum-number-of-balloons/
 */
public class MaximumNumberOfBalloons {

    private Set<Character> balloon = new HashSet<>(Arrays.asList('b', 'a', 'l', 'o', 'n'));

    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> counter = new HashMap<>();
        for(char c: text.toCharArray()) {
            if (!balloon.contains(c))
                continue;
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        if (counter.size() < 5)
            return 0;

        int rv = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            int cnt = entry.getValue();
            if (entry.getKey() == 'l' || entry.getKey() == 'o')
                cnt /= 2;
            if (cnt < rv)
                rv = cnt;
        }
        return  rv;
    }
}
