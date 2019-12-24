package me.lycheng.jeetcode.algorithm.math

class BinaryGapTest extends GroovyTestCase {

    BinaryGap solution = new BinaryGap()

    void testBinaryGap() {

        def cases = [
                22: 2,
                5 : 2,
                6 : 1,
                8 : 0
        ]

        cases.each {k, v ->
            assert v == solution.binaryGap(k)
        }
    }
}
