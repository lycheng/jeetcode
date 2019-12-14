package me.lycheng.jeetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 */
public class ShortestDistanceToACharacter {

    public int[] shortestToChar(String S, char C) {
        int[] res = new int[S.length()];

        char[] chars = S.toCharArray();
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c != C) {
                continue;
            }
            indexes.add(i);
        }

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == C) {
                res[i] = 0;
                continue;
            }

            int minDistance = Math.abs(indexes.get(0) - i);
            for (int j = 1; j < indexes.size(); j++) {
                int distance = Math.abs(indexes.get(j) - i);
                if (minDistance <= distance) {
                    break;
                }
                minDistance = distance;
            }
            res[i] = minDistance;
        }
        return res;
    }
}
