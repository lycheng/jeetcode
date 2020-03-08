package me.lycheng.jeetcode.algorithm.math

class SurfaceAreaOf3DShapesTest extends GroovyTestCase {
    void testSurfaceArea() {
        def solution = new SurfaceAreaOf3DShapes()
        def cases = [
                [[2]]                            : 10,
                [[1, 2], [3, 4]]                 : 34,
                [[1, 0], [0, 2]]                 : 16,
                [[1, 1, 1], [1, 0, 1], [1, 1, 1]]: 32,
                [[2, 2, 2], [2, 1, 2], [2, 2, 2]]: 46
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.surfaceArea(input as int[][]))
        }
    }
}
