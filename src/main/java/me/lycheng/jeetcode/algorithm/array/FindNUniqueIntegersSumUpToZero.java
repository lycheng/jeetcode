package me.lycheng.jeetcode.algorithm.array;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
 */
public class FindNUniqueIntegersSumUpToZero {

    public int[] sumZero(int n) {
        List<Integer> rv = new LinkedList<>();
        if (n % 2 == 1)
            rv.add(0);

        for (int i = 1; i < n; i++) {
            if (rv.size() == n)
                break;
            rv.add(i);
            rv.add(-i);
        }
        return rv.stream().mapToInt(i -> i).toArray();
    }
}
