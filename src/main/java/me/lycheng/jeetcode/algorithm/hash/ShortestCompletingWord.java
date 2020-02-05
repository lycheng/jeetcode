package me.lycheng.jeetcode.algorithm.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/shortest-completing-word/
 */
public class ShortestCompletingWord {

    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: licensePlate.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                c = (char) (c | 32);
                int cnt = map.getOrDefault(c, 0) + 1;
                map.put(c, cnt);
            }
        }

        int minLen = Integer.MAX_VALUE;
        String rv = "";
        for(String word: words) {
            Map<Character, Integer> counter = new HashMap<>();
            for(char c: word.toCharArray()) {
                c = (char) (c | 32);
                int cnt = counter.getOrDefault(c, 0) + 1;
                counter.put(c, cnt);
            }

            boolean isMatch = true;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                char c = entry.getKey();
                if (entry.getValue() > counter.getOrDefault(c, 0)) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch && word.length() < minLen) {
                rv = word;
                minLen = word.length();
            }
        }
        return rv;
    }
}
