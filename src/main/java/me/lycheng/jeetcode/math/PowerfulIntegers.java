package me.lycheng.jeetcode.math;

import java.util.*;

/**
 * https://leetcode.com/problems/powerful-integers/
 */
public class PowerfulIntegers {

    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int biggerOne = x > y? x: y;
        int smallerOne = x < y? x: y;

        Set<Integer> set = new HashSet<>();

        for (int i = 1; i < bound; i *= biggerOne) {
            for (int j = 1; j < bound; j *= smallerOne) {
                if (i + j > bound) {
                    break;
                }
                set.add(i + j);
                if (smallerOne == 1)
                    break;
            }
            if (biggerOne == 1)
                break;
        }
        List<Integer> res = new ArrayList<>();
        res.addAll(set);
        return res;
    }
}
