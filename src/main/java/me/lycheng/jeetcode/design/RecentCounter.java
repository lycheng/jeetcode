package me.lycheng.jeetcode.design;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/number-of-recent-calls/
 */
public class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while((t - queue.peek()) > 3000)
            queue.poll();
        return queue.size();
    }
}
