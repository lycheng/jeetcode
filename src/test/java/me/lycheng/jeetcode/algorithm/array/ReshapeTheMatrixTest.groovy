package me.lycheng.jeetcode.algorithm.array

class ReshapeTheMatrixTest extends GroovyTestCase {
    void testMatrixReshape() {
        def solution = new ReshapeTheMatrix()
        def nums = [[1, 2],
                    [3, 4]] as int[][]
        def r = 1
        def c = 4
        def expected = [[1, 2, 3, 4]] as int[][]

        assertEquals(expected, solution.matrixReshape(nums, r, c))
    }
}
