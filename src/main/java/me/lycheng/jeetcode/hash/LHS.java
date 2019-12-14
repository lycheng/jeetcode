package me.lycheng.jeetcode.hash;

import java.util.HashMap;
import java.util.Map;

/*
 * https://leetcode.com/problems/longest-harmonious-subsequence/description/
 */
public class LHS {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<Integer, Integer>();
        for (int n : nums) {
            int nCnt = counter.containsKey(n)? counter.get(n) + 1: 1;
            counter.put(n, nCnt);
        }

        int lhs = 0;
        for (int n: counter.keySet()) {
            int nCnt = counter.get(n);
            if (counter.containsKey(n+1)) {
                lhs = counter.get(n+1) + nCnt > lhs? counter.get(n+1) + nCnt: lhs;
            }
        }
        return lhs;
    }
}