package me.lycheng.jeetcode.algorithm.array

class FindNumbersWithEvenNumberOfDigitsTest extends GroovyTestCase {

    def solution = new FindNumbersWithEvenNumberOfDigits();

    void testHasEvenNumberOfDigits() {
        def cases = [
                1: false,
                10: true,
                111: false,
                9992: true
        ]

        cases.each {k, v ->
            assert solution.hasEvenNumberOfDigits(k) == v
        }
    }

    void testFindNumbers() {
        def nums = [555,901,482,1771] as int[]
        assert solution.findNumbers(nums) == 1
    }
}
