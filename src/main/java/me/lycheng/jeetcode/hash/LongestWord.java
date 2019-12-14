package me.lycheng.jeetcode.hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * https://leetcode.com/problems/longest-word-in-dictionary/
 */
public class LongestWord {

    public String longestWord(String[] words) {
        Arrays.sort(words);
        String rv = "";
        int maxLen = 0;
        Set<String> wordSet = new HashSet<>();
        wordSet.add("");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String prefix = word.substring(0, word.length() - 1);
            if (wordSet.contains(prefix)) {
                wordSet.add(word);
                if (word.length() > maxLen) {
                    rv = word;
                    maxLen = word.length();
                }
            }
        }
        return rv;
    }
}
