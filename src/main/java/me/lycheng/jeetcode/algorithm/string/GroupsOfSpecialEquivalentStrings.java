package me.lycheng.jeetcode.algorithm.string;

import java.util.*;

/**
 * https://leetcode.com/problems/groups-of-special-equivalent-strings/
 */
public class GroupsOfSpecialEquivalentStrings {

    public int numSpecialEquivGroups(String[] A) {
        Set<String> res = new HashSet<>();
        for(String s: A) {
            char[] chars = s.toCharArray();

            List<String> oddChars = new ArrayList<>();
            List<String> evenChars = new ArrayList<>();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 0) {
                    evenChars.add(String.valueOf(chars[i]));
                } else {
                    oddChars.add(String.valueOf(chars[i]));
                }
            }

            Collections.sort(oddChars);
            Collections.sort(evenChars);

            res.add(String.join("", oddChars) + String.join("", evenChars));
        }
        return res.size();
    }
}
