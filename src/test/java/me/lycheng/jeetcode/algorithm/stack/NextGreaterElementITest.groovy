package me.lycheng.jeetcode.algorithm.stack

class NextGreaterElementITest extends GroovyTestCase {
    void testNextGreaterElement() {
        def solution = new NextGreaterElementI();
        def nums1 = [4, 1, 2] as int[]
        def nums2 = [1, 3, 4, 2] as int[]
        def expected = [-1, 3, -1] as int[]
        assertEquals(expected, solution.nextGreaterElement(nums1, nums2))

        nums1 = [2, 4] as int[]
        nums2 = [1, 2, 3, 4] as int[]
        expected = [3, -1] as int[]
        assertEquals(expected, solution.nextGreaterElement(nums1, nums2))
    }
}
