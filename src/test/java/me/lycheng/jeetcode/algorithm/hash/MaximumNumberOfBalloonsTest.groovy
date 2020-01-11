package me.lycheng.jeetcode.algorithm.hash

class MaximumNumberOfBalloonsTest extends GroovyTestCase {
    void testMaxNumberOfBalloons() {
        def solution = new MaximumNumberOfBalloons()
        def cases = [
                "nlaebolko": 1,
                "loonbalxballpoon": 2
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.maxNumberOfBalloons(input))
        }
    }
}
