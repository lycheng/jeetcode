package me.lycheng.jeetcode.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int rs = 0;
        Set<String> jSet = new HashSet<>();
        for (String j : J.split("")) {
            jSet.add(j);
        }

        for (String s : S.split("")) {
            if (jSet.contains(s)) {
                rs++;
            }
        }
        return rs;
    }
}
