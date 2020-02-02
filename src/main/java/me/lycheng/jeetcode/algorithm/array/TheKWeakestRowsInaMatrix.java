package me.lycheng.jeetcode.algorithm.array;

import java.text.Collator;
import java.util.*;

/**
 * https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 */
public class TheKWeakestRowsInaMatrix {

    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ranks = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                ranks[i] += mat[i][j];
            }
        }

        Comparator<Integer> cmp = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int cntA = ranks[a];
                int cntB = ranks[b];
                return cntA - cntB != 0? cntB - cntA: b - a;
            }
        };

        PriorityQueue<Integer> pq = new PriorityQueue<>(k, cmp);
        for (int i = 0; i < ranks.length; i++) {
            if (pq.size() != k) {
                pq.add(i);
                continue;
            }
            int peek = pq.peek();
            if (cmp.compare(peek, i) < 0) {
                pq.poll();
                pq.add(i);
            }
        }

        int[] rv = new int[k];
        int i = k - 1;
        while (!pq.isEmpty()) {
            int peek = pq.poll();
            rv[i--] = peek;
        }
        return rv;
    }
}
