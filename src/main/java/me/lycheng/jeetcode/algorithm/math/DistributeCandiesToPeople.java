package me.lycheng.jeetcode.algorithm.math;

/**
 * https://leetcode.com/problems/distribute-candies-to-people/
 */
public class DistributeCandiesToPeople {

    public int[] distributeCandies(int candies, int num_people) {
        int[] rv = new int[num_people];

        int base = 1;
        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
                int toGive = base + i;
                if (candies <= toGive)
                    toGive = candies;

                candies -= toGive;
                rv[i] += toGive;
            }
            base += num_people;
        }
        return rv;
    }
}
