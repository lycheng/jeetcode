package me.lycheng.jeetcode.stack

class BaseballGameTest extends GroovyTestCase {

    BaseballGame solution = new BaseballGame()

    void testCalPoints() {

        def input = ["5", "2", "C", "D", "+"] as String[]
        def expected = 30
        assertEquals(expected, solution.calPoints(input))

        input = ["5", "-2", "4", "C", "D", "9", "+", "+"] as String[]
        expected = 27
        assertEquals(expected, solution.calPoints(input))
    }
}
