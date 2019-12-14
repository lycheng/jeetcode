package me.lycheng.jeetcode.math

class ConsecutiveNumbersSumTest extends GroovyTestCase {

    def solution = new ConsecutiveNumbersSum()

    void testConsecutiveNumbersSum() {
        def cases = [
                5: 2,
                9: 3,
                15: 4,
                855204: 8
        ]

        cases.each { k, v ->
            assertEquals(v, solution.consecutiveNumbersSum(k))
        }
    }
}
