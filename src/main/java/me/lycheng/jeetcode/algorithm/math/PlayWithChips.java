package me.lycheng.jeetcode.algorithm.math;

/**
 * https://leetcode.com/problems/play-with-chips/
 */
public class PlayWithChips {

    public int minCostToMoveChips(int[] chips) {
        int oddCnt = 0;
        int evenCnt = 0;

        for(int chip: chips) {
            if (chip % 2 == 1)
                oddCnt += 1;
            else
                evenCnt += 1;
        }
        return Math.min(oddCnt, evenCnt);
    }
}
