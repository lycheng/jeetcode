package me.lycheng.jeetcode.algorithm.hash;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/occurrences-after-bigram/
 */
public class OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");

        if (words.length < 2) {
            return new String[] {};
        }

        List<String> rv = new LinkedList<>();
        for (int i = 1; i < words.length; i++) {
            if (!words[i - 1].equals(first) || !words[i].equals(second))
                continue;

            if (i + 1 >= words.length)
                break;

            rv.add(words[i + 1]);
        }
        return rv.toArray(new String[0]);
    }
}
