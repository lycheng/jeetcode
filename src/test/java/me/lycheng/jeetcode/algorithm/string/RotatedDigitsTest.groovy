package me.lycheng.jeetcode.algorithm.string

class RotatedDigitsTest extends GroovyTestCase {
    void testRotatedDigits() {
        def solution = new RotatedDigits()
        def cases = [
                10: 4
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.rotatedDigits(input))
        }
    }
}
