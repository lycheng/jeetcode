package me.lycheng.jeetcode.algorithm.array

class MaximumAverageSubarrayITest extends GroovyTestCase {

    MaximumAverageSubarrayI mvs = new MaximumAverageSubarrayI()

    void testFindMaxAverage() {

        def nums = [1, 12, -5, -6, 50, 3] as int[]
        def k = 4
        def expected = 12.75

        assertEquals(expected, mvs.findMaxAverage(nums, k))

        nums = [-1] as int[]
        k = 1
        expected = -1

        assertEquals(expected, mvs.findMaxAverage(nums, k))
    }
}
