package me.lycheng.jeetcode.algorithm.math

class Maximum69NumberTest extends GroovyTestCase {
    void testMaximum69Number() {
        def solution = new Maximum69Number()
        def cases = [
                9669: 9969,
                9996: 9999,
                6: 9,
                9: 9,
        ]
        cases.each {input, expected ->
            assertEquals(expected, solution.maximum69Number(input))
        }
    }
}
