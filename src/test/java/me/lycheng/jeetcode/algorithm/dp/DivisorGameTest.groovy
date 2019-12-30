package me.lycheng.jeetcode.algorithm.dp

class DivisorGameTest extends GroovyTestCase {
    void testDivisorGame() {
        def solution = new DivisorGame()
        def cases = [
                2: true,
                3: false
        ]
        cases.each {input, expected ->
            assertEquals(expected, solution.divisorGame(input))
            assertEquals(solution.divisorGame(input), solution.divisorGame1(input))
        }
    }
}
