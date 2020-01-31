package me.lycheng.jeetcode.algorithm.bit

class BinaryNumberWithAlternatingBitsTest extends GroovyTestCase {
    void testHasAlternatingBits() {
        def solution = new BinaryNumberWithAlternatingBits()
        def cases = [
                5: true,
                7: false,
                11: false,
                10: true
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.hasAlternatingBits(input))
        }
    }
}
