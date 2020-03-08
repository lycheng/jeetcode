package me.lycheng.jeetcode.algorithm.array;

/**
 * https://leetcode.com/problems/distance-between-bus-stops/
 */
public class DistanceBetweenBusStops {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (distance.length <= 1 || start == destination) {
            return 0;
        }

        if (destination < start) {
            int t = destination;
            destination = start;
            start = t;
        }

        int sum = 0;
        for (int i: distance) {
            sum += i;
        }

        int rv = 0;
        for (int i = start; i < destination; i++) {
            rv += distance[i];
        }

        return Math.min(rv, (sum - rv));
    }
}
