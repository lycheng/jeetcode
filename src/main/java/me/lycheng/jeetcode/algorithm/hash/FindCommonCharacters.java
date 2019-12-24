package me.lycheng.jeetcode.algorithm.hash;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-common-characters/
 */
public class FindCommonCharacters {

    public List<String> commonChars(String[] A) {

        Map<String, Integer> lastCounter = new HashMap<>();
        for (int i = 0; i < A.length; i++) {

            Map<String, Integer> curCounter = new HashMap<>();
            for (char ch : A[i].toCharArray()) {
                String key = String.valueOf(ch);
                curCounter.put(key, curCounter.getOrDefault(key, 0) + 1);
            }

            if (i == 0) {
                for (Map.Entry<String, Integer> entry : curCounter.entrySet())
                    lastCounter.put(entry.getKey(), entry.getValue());
                continue;
            }

            Map<String, Integer> newCounter = new HashMap<>();
            for (Map.Entry<String, Integer> entry : curCounter.entrySet()) {
                if (lastCounter.containsKey(entry.getKey())) {
                    newCounter.put(entry.getKey(),
                            Math.min(lastCounter.get(entry.getKey()), curCounter.get(entry.getKey())));
                }
            }
            lastCounter = newCounter;
        }

        List<String> res = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : lastCounter.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                res.add(entry.getKey());
            }
        }
        return res;
    }
}
