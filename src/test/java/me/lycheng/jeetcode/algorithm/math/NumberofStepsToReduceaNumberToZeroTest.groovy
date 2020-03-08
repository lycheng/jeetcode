package me.lycheng.jeetcode.algorithm.math

class NumberofStepsToReduceaNumberToZeroTest extends GroovyTestCase {
    void testNumberOfSteps() {
        def solution = new NumberofStepsToReduceaNumberToZero()
        def cases = [
                0: 0,
                1: 1,
                2: 2,
                14: 6,
                15: 7
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.numberOfSteps(input))
        }
    }
}
