package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/partition-array-into-three-parts-with-equal-sum/
 */
public class PartitionArrayIntoThreePartsWithEqualSum {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int i: A)
            sum += i;

        if (sum % 3 != 0)
            return false;

        int first = 0;
        for (int i = 0; i < A.length - 2; i++) {
            first += A[i];
            if (first != sum / 3)
                continue;

            int second = 0;
            for (int j = i + 1; j < A.length - 1; j++) {
                second += A[j];
                if (second == first)
                    return true;
            }
        }
        return false;
    }
}
