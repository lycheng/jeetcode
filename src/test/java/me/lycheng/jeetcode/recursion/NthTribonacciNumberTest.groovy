package me.lycheng.jeetcode.recursion

class NthTribonacciNumberTest extends GroovyTestCase {
    void testTribonacci() {
        def solution = new NthTribonacciNumber()
        def cases = [
                0: 0,
                1: 1,
                2: 1,
                3: 2,
                4: 4,
                25: 1389537
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.tribonacci(input))
        }
    }
}
