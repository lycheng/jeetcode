package me.lycheng.jeetcode.algorithm.hash;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int rs = 0;
        Set<String> jSet = new HashSet<>();
        Collections.addAll(jSet, J.split(""));

        for (String s : S.split("")) {
            if (jSet.contains(s)) {
                rs++;
            }
        }
        return rs;
    }
}
