package me.lycheng.jeetcode.algorithm.array

class Shift2DGridTest extends GroovyTestCase {
    void testShiftGrid() {
        def solution = new Shift2DGrid()

        def grid = [[3, 8, 1, 9], [19, 7, 2, 5], [4, 6, 11, 10], [12, 0, 21, 13]] as int[][]
        def k = 4
        def expected = [[12, 0, 21, 13], [3, 8, 1, 9], [19, 7, 2, 5], [4, 6, 11, 10]]
        assertEquals(expected, solution.shiftGrid(grid, k))

        grid = [[1, 2, 3], [4, 5, 6], [7, 8, 9]] as int[][]
        k = 1
        expected = [[9, 1, 2], [3, 4, 5], [6, 7, 8]]
        assertEquals(expected, solution.shiftGrid(grid, k))

        grid = [[1], [2], [3], [4], [7], [6], [5]] as int[][]
        k = 23
        expected = [[6], [5], [1], [2], [3], [4], [7]]
        assertEquals(expected, solution.shiftGrid(grid, k))
    }
}
