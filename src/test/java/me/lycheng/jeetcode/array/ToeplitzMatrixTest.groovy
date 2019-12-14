package me.lycheng.jeetcode.array

class ToeplitzMatrixTest extends GroovyTestCase {

    ToeplitzMatrix solution = new ToeplitzMatrix()

    void testIsToeplitzMatrix() {
        def matrix = [
                [1, 2, 3, 4],
                [5, 1, 2, 3],
                [9, 5, 1, 2]
        ] as int[][]

        assert solution.isToeplitzMatrix(matrix)

        matrix = [
                [1, 2],
                [2, 2]
        ] as int[][]

        assert !solution.isToeplitzMatrix(matrix)
    }

    void testIsToeplitz() {
        def matrix = [
                [1, 2, 3, 4],
                [5, 1, 2, 3],
                [9, 5, 1, 2]
        ] as int[][]

        assert solution.isToeplitz(matrix, 2, 0)
        assert solution.isToeplitz(matrix, 1, 0)
        assert solution.isToeplitz(matrix, 0, 0)

        matrix = [
                [1, 2],
                [2, 2]
        ] as int[][]

        assert !solution.isToeplitz(matrix, 0, 0)
    }
}
