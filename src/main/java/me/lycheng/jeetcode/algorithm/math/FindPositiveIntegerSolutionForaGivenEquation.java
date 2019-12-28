package me.lycheng.jeetcode.algorithm.math;

import me.lycheng.jeetcode.CustomFunction;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindPositiveIntegerSolutionForaGivenEquation {

    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> rv = new LinkedList<>();
        int x = 1;
        int y = 1;

        while (customfunction.f(x, y) < z)
            x += 1;

        while (x > 0) {
            while (x > 0 && customfunction.f(x, y) > z)
                x--;

            if (x > 0 && customfunction.f(x, y) == z)
                rv.add(Arrays.asList(x, y));

            y++;
        }
        return rv;
    }
}
