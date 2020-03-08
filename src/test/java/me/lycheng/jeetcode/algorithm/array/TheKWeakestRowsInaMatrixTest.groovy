package me.lycheng.jeetcode.algorithm.array

class TheKWeakestRowsInaMatrixTest extends GroovyTestCase {
    void testKWeakestRows() {
        def solution = new TheKWeakestRowsInaMatrix()
        def mat = [[1, 1, 0, 0, 0],
                   [1, 1, 1, 1, 0],
                   [1, 0, 0, 0, 0],
                   [1, 1, 0, 0, 0],
                   [1, 1, 1, 1, 1]]
        def k = 3
        def expected = [2, 0, 3]
        assertEquals(expected as int[], solution.kWeakestRows(mat as int[][], k))
    }
}
