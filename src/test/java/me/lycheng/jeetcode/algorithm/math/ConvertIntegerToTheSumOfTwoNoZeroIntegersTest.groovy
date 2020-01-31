package me.lycheng.jeetcode.algorithm.math

class ConvertIntegerToTheSumOfTwoNoZeroIntegersTest extends GroovyTestCase {
    void testGetNoZeroIntegers() {
        def solution = new ConvertIntegerToTheSumOfTwoNoZeroIntegers()
        def cases = [
                2: [1, 1],
                11: [2, 9],
                10000: [1, 9999],
                69: [1, 68],
                1010: [11, 999]
        ]

        cases.each {input, expected ->
            assertEquals(expected as int[], solution.getNoZeroIntegers(input))
        }
    }
}
