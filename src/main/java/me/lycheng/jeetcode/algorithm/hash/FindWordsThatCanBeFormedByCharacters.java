package me.lycheng.jeetcode.algorithm.hash;

import java.util.HashMap;
import java.util.Map;

public class FindWordsThatCanBeFormedByCharacters {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> letterCounter = new HashMap<>();

        for(char c: chars.toCharArray()) {
            letterCounter.put(c, letterCounter.getOrDefault(c, 0) + 1);
        }

        int rv = 0;
        for(String word: words) {
            Map<Character, Integer> counter = new HashMap<>();
            for(char c: word.toCharArray()) {
                counter.put(c, counter.getOrDefault(c, 0) + 1);
            }

            boolean flag = true;
            for(Character c: counter.keySet()) {
                if (!letterCounter.containsKey(c) || letterCounter.get(c) < counter.get(c)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                rv += word.length();
            }
        }
        return rv;
    }
}
