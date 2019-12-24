package me.lycheng.jeetcode.algorithm.array

class TransposeMatrixTest extends GroovyTestCase {

    TransposeMatrix tm = new TransposeMatrix()

    void testTranspose() {

        int[][] src = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
        int[][] expected = [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
        assertArrayEquals(expected, tm.transpose(src))

        src = [[1, 2, 3], [4, 5, 6]]
        expected = [[1, 4], [2, 5], [3, 6]]
        assertArrayEquals(expected, tm.transpose(src))
    }
}
