package me.lycheng.jeetcode.algorithm.bit

class PrimeNumberOfSetBitsInBinaryRepresentationTest extends GroovyTestCase {
    void testCountPrimeSetBits() {
        def solution = new PrimeNumberOfSetBitsInBinaryRepresentation()
        def cases = [
                [6, 10]: 4,
                [10, 15]: 5
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.countPrimeSetBits(input.get(0), input.get(1)))
        }
    }
}
