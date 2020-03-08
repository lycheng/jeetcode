package me.lycheng.jeetcode.algorithm.math

class LargestPerimeterTriangleTest extends GroovyTestCase {
    void testLargestPerimeter() {
        def solution = new LargestPerimeterTriangle()
        def cases = [
                [2, 1, 2]   : 5,
                [1, 2, 1]   : 0,
                [3, 2, 3, 4]: 10,
                [3, 6, 2, 3]: 8
        ]

        cases.each { input, expected ->
            assertEquals(expected, solution.largestPerimeter(input as int[]))
        }
    }
}
