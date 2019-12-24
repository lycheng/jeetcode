package me.lycheng.jeetcode.algorithm.array

class AvailableCapturesForRookTest extends GroovyTestCase {

    AvailableCapturesForRook ac = new AvailableCapturesForRook()

    void testNumRookCaptures() {

        def board = [
                [".", ".", ".", ".", ".", ".", ".", "."],
                [".", ".", ".", "p", ".", ".", ".", "."],
                [".", ".", ".", "R", ".", ".", ".", "p"],
                [".", ".", ".", ".", ".", ".", ".", "."],
                [".", ".", ".", ".", ".", ".", ".", "."],
                [".", ".", ".", "p", ".", ".", ".", "."],
                [".", ".", ".", ".", ".", ".", ".", "."],
                [".", ".", ".", ".", ".", ".", ".", "."]
        ] as char[][]

        def expected = 3
        assertEquals(expected, ac.numRookCaptures(board))

        board = [
                [".", ".", ".", ".", ".", ".", ".", "."],
                [".", ".", ".", ".", ".", ".", ".", "."],
                [".", ".", ".", ".", ".", ".", ".", "."],
                [".", ".", ".", "R", ".", ".", ".", "."],
                [".", ".", ".", ".", ".", ".", ".", "."],
                [".", ".", ".", ".", ".", ".", ".", "."],
                [".", ".", ".", ".", ".", ".", ".", "."],
                [".", ".", ".", ".", ".", ".", ".", "."]
        ] as char[][]
        expected = 0
        assertEquals(expected, ac.numRookCaptures(board))

        board = [
                [".", ".", ".", ".", ".", ".", ".", "."],
                [".", ".", ".", "p", ".", ".", ".", "."],
                [".", ".", ".", "p", ".", ".", ".", "."],
                ["p", "p", ".", "R", ".", "p", "B", "."],
                [".", ".", ".", ".", ".", ".", ".", "."],
                [".", ".", ".", "B", ".", ".", ".", "."],
                [".", ".", ".", "p", ".", ".", ".", "."],
                [".", ".", ".", ".", ".", ".", ".", "."]
        ] as char[][]
        expected = 3
        assertEquals(expected, ac.numRookCaptures(board))


    }
}
