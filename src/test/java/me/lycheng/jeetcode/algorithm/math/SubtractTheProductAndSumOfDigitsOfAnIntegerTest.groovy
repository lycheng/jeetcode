package me.lycheng.jeetcode.algorithm.math

class SubtractTheProductAndSumOfDigitsOfAnIntegerTest extends GroovyTestCase {

    void testSubtractProductAndSum() {
        def solution = new SubtractTheProductAndSumOfDigitsOfAnInteger()
        def cases = [
                234: 15,
                4421: 21
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.subtractProductAndSum(input))
        }
    }
}
