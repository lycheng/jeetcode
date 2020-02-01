package me.lycheng.jeetcode.algorithm.math

class LargestTriangleAreaTest extends GroovyTestCase {
    void testLargestTriangleArea() {
        def solution = new LargestTriangleArea()
        def cases = [
                [[0, 0], [0, 1], [1, 0], [0, 2], [2, 0]]: 2
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.largestTriangleArea(input as int[][]))
        }
    }
}
