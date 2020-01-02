package me.lycheng.jeetcode.algorithm.math

class PlayWithChipsTest extends GroovyTestCase {
    void testMinCostToMoveChips() {
        def solution = new PlayWithChips()
        def cases = [
                [1, 2, 3]      : 1,
                [2, 2, 2, 3, 3]: 2
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.minCostToMoveChips(input as int[]))
        }
    }
}
