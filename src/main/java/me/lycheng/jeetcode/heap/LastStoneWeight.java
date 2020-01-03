package me.lycheng.jeetcode.heap;

import java.util.PriorityQueue;

public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> prq = new PriorityQueue<>((x, y) -> y - x);
        for(int stone: stones)
            prq.add(stone);

        while(!prq.isEmpty()) {
            int first = prq.poll();
            if (prq.isEmpty())
                return first;

            int second = prq.poll();
            if (first == second)
                continue;

            prq.add(first - second);
        }
        return 0;
    }
}
