package me.lycheng.jeetcode.algorithm.hash

class NRepeatedElementInSize2NArrayTest extends GroovyTestCase {
    void testRepeatedNTimes() {
        int[] src = [5, 1, 5, 2, 5, 3, 5, 4]
        NRepeatedElementInSize2NArray solution = new NRepeatedElementInSize2NArray()

        assertEquals(5, solution.repeatedNTimes(src))
    }
}
