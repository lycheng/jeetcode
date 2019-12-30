package me.lycheng.jeetcode.algorithm.array

class MatrixCellsInDistanceOrderTest extends GroovyTestCase {
    void testAllCellsDistOrder() {
        def solution = new MatrixCellsInDistanceOrder()
        def R = 1, C = 2, r0 = 0, c0 = 0
        def expected = [[0, 0], [0, 1]] as int[][]

        assertEquals(expected, solution.allCellsDistOrder(R, C, r0, c0))
    }
}
