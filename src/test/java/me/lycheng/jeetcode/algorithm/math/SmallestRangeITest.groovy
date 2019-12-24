package me.lycheng.jeetcode.algorithm.math

class SmallestRangeITest extends GroovyTestCase {

    SmallestRangeI s = new SmallestRangeI()

    void testSmallestRangeI() {

        int[] A = [1]
        int K = 0
        int expected = 0
        assertEquals(expected, s.smallestRangeI(A, K))

        A = [0, 10]
        K = 2
        expected = 6
        assertEquals(expected, s.smallestRangeI(A, K))
    }
}
