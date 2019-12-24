package me.lycheng.jeetcode.algorithm.math;

import java.util.LinkedList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            if (!isSelfDividing(i)) {
                continue;
            }
            res.add(i);
        }
        return res;
    }

    public boolean isSelfDividing(int num) {
        for (int i = num; i != 0; i /= 10) {
            int digit = i % 10;
            if (digit % 10  == 0|| num % digit != 0) {
                return false;
            }
        }
        return true;
    }
}
