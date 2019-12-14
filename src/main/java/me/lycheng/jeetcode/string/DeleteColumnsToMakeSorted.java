package me.lycheng.jeetcode.string;

/**
 * https://leetcode.com/problems/delete-columns-to-make-sorted/
 */
public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] A) {
        int len = A[0].length();
        int cntOfRows = A.length;
        int res = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 1; j < cntOfRows; j++) {
                if (A[j].charAt(i) < A[j - 1].charAt(i)) {
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}
