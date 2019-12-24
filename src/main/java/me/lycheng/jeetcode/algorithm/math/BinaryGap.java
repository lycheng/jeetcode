package me.lycheng.jeetcode.algorithm.math;

/**
 * https://leetcode.com/problems/binary-gap/
 */
public class BinaryGap {

    public int binaryGap(int N) {
        int last1Index = -1;
        int longestDistance = 0;

        for (int i = 0; N != 0; N = N >> 1, i += 1) {
            if ((N & 1) != 1) {
                continue;
            }

            if (last1Index != -1 && i - last1Index > longestDistance)
                longestDistance = i - last1Index;

            last1Index = i;
        }
        return longestDistance;
    }
}
