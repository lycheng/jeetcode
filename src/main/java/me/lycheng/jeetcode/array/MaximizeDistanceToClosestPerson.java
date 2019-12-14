package me.lycheng.jeetcode.array;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/maximize-distance-to-closest-person/
 */
public class MaximizeDistanceToClosestPerson {

    public int maxDistToClosest(int[] seats) {

        Queue<Integer> notEmptySeats = new LinkedList<>();
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                continue;
            }
            notEmptySeats.add(i);
        }

        Integer maxDist = Integer.MIN_VALUE;
        Integer prevIndex = null;
        Integer nextIndex = notEmptySeats.poll();

        int res = 0;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                prevIndex = i;
                nextIndex = notEmptySeats.poll();
                continue;
            }

            int curMinDist = 0;
            if (prevIndex != null && nextIndex != null) {
                curMinDist = Math.min(nextIndex - i, i - prevIndex);

            } else if (prevIndex != null) {
                curMinDist = i - prevIndex;
            } else {
                curMinDist = nextIndex - i;
            }

            if (curMinDist > res) {
                res = curMinDist;
            }
        }
        return res;
    }
}
