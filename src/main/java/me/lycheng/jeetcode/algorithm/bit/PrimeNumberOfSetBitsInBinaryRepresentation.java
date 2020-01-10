package me.lycheng.jeetcode.algorithm.bit;

/**
 * https://leetcode.com/problems/prime-number-of-set-bits-in-binary-representation/
 */
public class PrimeNumberOfSetBitsInBinaryRepresentation {

    static int MAX = 32;

    static boolean[] notPrimeMap = new boolean[MAX];

    static {
        notPrimeMap[1] = true;
        notPrimeMap[2] = false;
        for (int i = 2; i <= MAX / 2; i++) {
            for (int j = 2; i * j < MAX; j++) {
                notPrimeMap[i * j] = true;
            }
        }
    }

    public int countPrimeSetBits(int L, int R) {
        int rv = 0;
        for (int i = L; i <= R; i++) {
            int oneBits = 0;
            int n = i;
            while (n > 0) {
                oneBits += (n & 1);
                n = n >> 1;
            }

            if (notPrimeMap[oneBits])
                continue;
            rv += 1;
        }
        return rv;
    }
}
