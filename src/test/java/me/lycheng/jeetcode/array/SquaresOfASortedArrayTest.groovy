package me.lycheng.jeetcode.array

class SquaresOfASortedArrayTest extends GroovyTestCase {
    void testSortedSquares() {
        SquaresOfASortedArray solution = new SquaresOfASortedArray()
        int[] src = [-4, -1, 0, 3, 10]
        int[] target = [0, 1, 9, 16, 100]

        assert target.equals(solution.sortedSquares(src))
    }
}
