package me.lycheng.jeetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/number-of-lines-to-write-string/
 */
public class NumberOfLinesToWriteString {

    public int[] numberOfLines(int[] widths, String S) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < widths.length; i++) {
            map.put(String.valueOf((char)('a' + i)), widths[i]);
        }

        char[] chars = S.toCharArray();
        int lines = 1;
        int lastUnits = 0;
        for(char c: chars) {
            int width = map.get(String.valueOf(c));
            lastUnits += width;
            if (lastUnits > 100) {
                lines++;
                lastUnits = width;
            }
        }
        return new int[]{lines, lastUnits};
    }
}
