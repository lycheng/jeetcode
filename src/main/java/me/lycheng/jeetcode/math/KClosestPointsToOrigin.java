package me.lycheng.jeetcode.math;

import java.util.*;

/**
 * https://leetcode.com/problems/k-closest-points-to-origin/
 */
public class KClosestPointsToOrigin {

    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Integer> distanceIndexMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < points.length; i++) {
            int distance = distanceToOrigin(points[i][0], points[i][1]);
            distanceIndexMap.put(distance, i);

            if (minHeap.size() < K || minHeap.peek() > distance) {
                if (minHeap.size() == K) {
                    minHeap.remove(minHeap.peek());
                }
                minHeap.add(distance);
            }
        }

        int[][] res = new int[K][2];
        int i = 0;
        for (Integer distance: minHeap) {
            int index = distanceIndexMap.get(distance);
            res[i][0] = points[index][0];
            res[i++][1] = points[index][1];
        }
        return res;
    }

    private int distanceToOrigin(int x, int y) {
        return x * x + y * y;
    }
}
