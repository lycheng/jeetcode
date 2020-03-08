package me.lycheng.jeetcode.algorithm.bit;

/**
 * https://leetcode.com/problems/binary-number-with-alternating-bits/
 */
public class BinaryNumberWithAlternatingBits {

    public boolean hasAlternatingBits(int n) {
        int lastBit = -1;
        while (n > 0) {
            int bit = n & 1;
            if (bit == lastBit)
                return false;

            lastBit = bit;
            n = n >> 1;
        }
        return true;
    }
}
