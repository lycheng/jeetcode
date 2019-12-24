package me.lycheng.jeetcode.algorithm.array

class HeightCheckerTest extends GroovyTestCase {

    def solution = new HeightChecker()

    void testHeightChecker() {
        def heights = [1, 1, 4, 2, 1, 3] as int[]
        def expected = 3

        assertEquals(expected, solution.heightChecker(heights))
    }
}
