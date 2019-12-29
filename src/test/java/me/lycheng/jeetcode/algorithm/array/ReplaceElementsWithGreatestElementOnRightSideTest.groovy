package me.lycheng.jeetcode.algorithm.array

class ReplaceElementsWithGreatestElementOnRightSideTest extends GroovyTestCase {
    void testReplaceElements() {
        def solution = new ReplaceElementsWithGreatestElementOnRightSide()

        def input = [17, 18, 5, 4, 6, 1] as int[]
        def expected = [18, 6, 6, 6, 1, -1] as int[]

        assertEquals(expected, solution.replaceElements(input))

        input = [1] as int[]
        expected = [-1] as int[]
        assertEquals(expected, solution.replaceElements(input))
    }
}
