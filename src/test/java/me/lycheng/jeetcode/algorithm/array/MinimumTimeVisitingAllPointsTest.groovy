package me.lycheng.jeetcode.algorithm.array

class MinimumTimeVisitingAllPointsTest extends GroovyTestCase {
    void testMinTimeToVisitAllPoints() {
        def solution = new MinimumTimeVisitingAllPoints()
        def cases = [
                5: [[3,2],[-2,2]] as int[][],
                7: [[1,1],[3,4],[-1,0]] as int[][]
        ]

        cases.each {expected, input ->
            assertEquals(expected, solution.minTimeToVisitAllPoints(input))
        }
    }
}
