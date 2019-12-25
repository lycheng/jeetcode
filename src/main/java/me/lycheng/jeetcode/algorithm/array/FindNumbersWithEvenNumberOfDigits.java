package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */
public class FindNumbersWithEvenNumberOfDigits {

    public boolean hasEvenNumberOfDigits(int num) {
        int digitCnt = 0;
        while (num > 0) {
            digitCnt += 1;
            num /= 10;
        }
        return digitCnt % 2 == 0;
    }

    public int findNumbers(int[] nums) {
        int rv = 0;
        for (int num: nums) {
            if (hasEvenNumberOfDigits(num))
                rv += 1;
        }
        return rv;
    }
}
