package me.lycheng.jeetcode.algorithm.string;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 */
public class DecryptStringFromAlphabetToIntegerMapping {

    final private Map<String, String> map = Stream.of(new String[][]{
            {"1", "a"},
            {"2", "b"},
            {"3", "c"},
            {"4", "d"},
            {"5", "e"},
            {"6", "f"},
            {"7", "g"},
            {"8", "h"},
            {"9", "i"},
            {"10#", "j"},
            {"11#", "k"},
            {"12#", "l"},
            {"13#", "m"},
            {"14#", "n"},
            {"15#", "o"},
            {"16#", "p"},
            {"17#", "q"},
            {"18#", "r"},
            {"19#", "s"},
            {"20#", "t"},
            {"21#", "u"},
            {"22#", "v"},
            {"23#", "w"},
            {"24#", "x"},
            {"25#", "y"},
            {"26#", "z"}
    }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

    public String freqAlphabets(String s) {
        if (s.length() <= 3)
            return map.get(s);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 1) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                sb.append(map.get(s.substring(i, i + 3)));
                i += 2;
            } else {
                sb.append(map.get(String.valueOf(s.charAt(i))));
            }
        }
        return sb.toString();
    }
}
