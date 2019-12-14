package me.lycheng.jeetcode.string;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {

    private final String[] alphabet = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",
            ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
            "...","-","..-","...-",".--","-..-","-.--","--.."
    };

    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();

        for (String word: words) {
            StringBuffer sb = new StringBuffer();
            for (char c: word.toCharArray()) {
                int index = c - 'a';
                String m = alphabet[index];
                sb.append(m);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}
