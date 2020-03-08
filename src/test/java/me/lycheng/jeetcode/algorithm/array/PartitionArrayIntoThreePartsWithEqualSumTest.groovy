package me.lycheng.jeetcode.algorithm.array

import me.lycheng.jeetcode.algorithm.array.PartitionArrayIntoThreePartsWithEqualSum

class PartitionArrayIntoThreePartsWithEqualSumTest extends GroovyTestCase {
    void testCanThreePartsEqualSum() {
        def solution = new PartitionArrayIntoThreePartsWithEqualSum()
        def cases = [
                [0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1]: true,
                [0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1]: false,
                [3, 3, 6, 5, -2, 2, 5, 1, -9, 4]   : true
        ]

        cases.each {input, expected ->
            assertEquals(expected, solution.canThreePartsEqualSum(input as int[]))
        }
    }
}