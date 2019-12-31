package me.lycheng.jeetcode.algorithm.array

class FindNUniqueIntegersSumUpToZeroTest extends GroovyTestCase {
    void testSumZero() {
        def solution = new FindNUniqueIntegersSumUpToZero()
        def cases = [
                5: [0, 1, -1, 2, -2],
                3: [0, 1, -1],
                2: [1, -1],
                1: [0]
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.sumZero(input))
        }
    }
}
