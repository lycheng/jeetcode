package me.lycheng.jeetcode.algorithm.array

class LargestNumberAtLeastTwiceOfOthersTest extends GroovyTestCase {

    LargestNumberAtLeastTwiceOfOthers l = new LargestNumberAtLeastTwiceOfOthers()

    void testDominantIndex() {

        def nums = [3, 6, 1, 0] as int[]
        def expected = 1
        assertEquals(expected, l.dominantIndex(nums))

        nums = [1, 2, 3, 4] as int[]
        expected = -1
        assertEquals(expected, l.dominantIndex(nums))

    }
}
