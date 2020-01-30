package me.lycheng.jeetcode.algorithm.math

class ComplementOfBase10IntegerTest extends GroovyTestCase {
    void testBitwiseComplement() {
        def solution = new ComplementOfBase10Integer()
        def cases = [
                10: 5,
                5: 2,
                7: 0,
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.bitwiseComplement(input))
        }
    }
}
