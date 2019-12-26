package me.lycheng.jeetcode.algorithm.array

class CellsWithOddValuesInaMatrixTest extends GroovyTestCase {
    void testOddCells() {
        def solution = new CellsWithOddValuesInaMatrix()

        def n = 2
        def m = 3
        def indices = [[0,1],[1,1]] as int[][]
        def expected = 6

        assertEquals(expected, solution.oddCells(n, m, indices))

        n = 2
        m = 2
        indices = [[1,1],[0,0]] as int[][]
        expected = 0
        assertEquals(expected, solution.oddCells(n, m, indices))
    }
}
