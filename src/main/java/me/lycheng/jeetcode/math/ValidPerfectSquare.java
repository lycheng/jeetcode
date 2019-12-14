package me.lycheng.jeetcode.math;

/**
 * https://leetcode.com/problems/valid-perfect-square/
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num <= 1)
            return true;

        for (int i = 1; i <= num / 2; i++) {
            int j = i * i;
            if (j > num)
                break;
            else if (j == num)
                return true;
        }
        return false;
    }

    public boolean isPerfectSquareWithBinarySearch(int num) {
        if (num <= 1)
            return true;

        long l = 1;
        long r = num / 2;
        long m;
        long n = (long) num;

        while (l <= r) {
            m = l + (r - l) / 2;
            long mm = m * m; // 不使用 long 类型的话会溢出

            if (mm == n)
                return true;
            else if (mm < n)
                l = m + 1;
            else
                r = m - 1;
        }
        return false;
    }
}
