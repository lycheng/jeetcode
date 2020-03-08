package me.lycheng.jeetcode.algorithm.hash

class HowManyNumbersAreSmallerThanTheCurrentNumberTest extends GroovyTestCase {
    void testSmallerNumbersThanCurrent() {
        def solution = new HowManyNumbersAreSmallerThanTheCurrentNumber()
        def cases = [
                [8, 1, 2, 2, 3]: [4, 0, 1, 1, 3],
                [6, 5, 4, 8]   : [2, 1, 0, 3],
                [7, 7, 7, 7]   : [0, 0, 0, 0]
        ]

        cases.each { input, expected ->
            assertEquals(expected as int[], solution.smallerNumbersThanCurrent(input as int[]))
        }
    }
}
