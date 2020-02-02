package me.lycheng.jeetcode.algorithm.array

class FairCandySwapTest extends GroovyTestCase {
    void testFairCandySwap() {

        def solution = new FairCandySwap()
        def A = [1, 1]
        def B = [2, 2]
        def expected = [1, 2]
        assertEquals(expected as int[], solution.fairCandySwap(A as int[], B as int[]))

        A = [1, 2, 5]
        B = [2, 4]
        expected = [5, 4]
        assertEquals(expected as int[], solution.fairCandySwap(A as int[], B as int[]))
    }
}
