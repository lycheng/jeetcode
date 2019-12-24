package me.lycheng.jeetcode.algorithm.hash;

import java.util.*;

/**
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 */
public class UncommonWordsFromTwoSentences {

    public String[] uncommonFromSentences(String A, String B) {

        Map<String, Integer> counter4A = new HashMap<>();
        Map<String, Integer> counter4B = new HashMap<>();

        for(String word: A.split(" ")) {
            counter4A.put(word, counter4A.getOrDefault(word, 0) + 1);
        }

        for(String word: B.split(" ")) {
            counter4B.put(word, counter4B.getOrDefault(word, 0) + 1);

        }

        List<String> res = new LinkedList<>();
        for(Map.Entry<String, Integer> entry: counter4A.entrySet()) {
            if (entry.getValue() > 1 || counter4B.containsKey(entry.getKey()))
                continue;
            res.add(entry.getKey());
        }

        for(Map.Entry<String, Integer> entry: counter4B.entrySet()) {
            if (entry.getValue() > 1 || counter4A.containsKey(entry.getKey()))
                continue;
            res.add(entry.getKey());
        }
        return res.stream().toArray(String[]::new);
    }
}
