package me.lycheng.jeetcode.algorithm.math;

/**
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
public class NumberofStepsToReduceaNumberToZero {

    public int numberOfSteps (int num) {
        int rv = 0;
        for (; num > 0; rv++) {
            if ((num & 1) == 1)
                num -= 1;
            else
                num = num >> 1;
        }
        return rv;
    }
}
