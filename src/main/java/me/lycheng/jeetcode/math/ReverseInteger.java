package me.lycheng.jeetcode.math;

/*
 * https://leetcode.com/problems/reverse-integer/
 */
class ReverseInteger {

    public int reverse(int x) {
        int flag = 1;
        if (x < 0) {
            flag = -1;
            x = x * -1;
        }
        int result = 0;
        while (x > 0) {
            int tmp = result * 10 + x % 10;
            if ((tmp / 10) != result) {
                return 0;
            }
            result = tmp;
            x = x / 10;
        }
        return result * flag;
    }
}