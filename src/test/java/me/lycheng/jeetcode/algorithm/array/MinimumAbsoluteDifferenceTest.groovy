package me.lycheng.jeetcode.algorithm.array

class MinimumAbsoluteDifferenceTest extends GroovyTestCase {
    void testMinimumAbsDifference() {
        def solution = new MinimumAbsoluteDifference()
        def cases = [
                [4, 2, 1, 3]                    : [[1, 2], [2, 3], [3, 4]],
                [1, 3, 6, 10, 15]               : [[1, 3]],
                [3, 8, -10, 23, 19, -4, -14, 27]: [[-14, -10], [19, 23], [23, 27]]
        ]

        cases.each { input, expected ->
            assertEquals(expected, solution.minimumAbsDifference(input as int[]))
        }
    }
}
