package me.lycheng.jeetcode.algorithm.greedy

class TwoCitySchedulingTest extends GroovyTestCase {
    void testTwoCitySchedCost() {
        def solution = new TwoCityScheduling()
        def cases = [
                [[10,20],[30,200],[400,50],[30,20]]: 110
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.twoCitySchedCost(input as int[][]))
        }
    }
}
