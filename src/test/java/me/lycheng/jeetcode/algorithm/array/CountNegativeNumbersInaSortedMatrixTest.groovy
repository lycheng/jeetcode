package me.lycheng.jeetcode.algorithm.array

class CountNegativeNumbersInaSortedMatrixTest extends GroovyTestCase {
    void testCountNegatives() {
        def solution = new CountNegativeNumbersInaSortedMatrix()
        def cases = [
                [[4, 3, 2, -1], [3, 2, 1, -1], [1, 1, -1, -2], [-1, -1, -2, -3]]: 8,
                [[3, 2], [1, 0]]                                                : 0
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.countNegatives(input as int[][]))
        }
    }
}
