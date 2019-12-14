package me.lycheng.jeetcode.array;

/**
 * https://leetcode.com/problems/sum-of-even-numbers-after-queries/
 */
public class SumOfEvenNumbersAfterQueries {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int[] res = new int[A.length];
        int j = 0;
        for(int[] query: queries) {
            int v = query[0];
            int i = query[1];

            A[i] += v;
            res[j++] = sumOfEvenValues(A);
        }

        return res;
    }

    public int sumOfEvenValues(int[] ints) {
        int res = 0;
        for (int i: ints) {
            if ((i & 1) == 0) {
                res += i;
            }
        }
        return res;
    }
}
