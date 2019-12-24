package me.lycheng.jeetcode.algorithm.tree

import me.lycheng.jeetcode.TreeNode

class RangeSumOfBSTTest extends GroovyTestCase {

    def solution = new RangeSumOfBST()

    void testRangeSumBST() {

        def root = TreeNode.fromList([3, 1, 5])

        def L = 2
        def R = 4
        def expected = 3
        assertEquals(expected, solution.rangeSumBST(root, L, R))

        L = 1
        R = 3
        expected = 4
        assertEquals(expected, solution.rangeSumBST(root, L, R))

        L = 3
        R = 5
        expected = 8
        assertEquals(expected, solution.rangeSumBST(root, L, R))

        root = TreeNode.fromList([10, 5, 15, 3, 7, null, 18])
        L = 7
        R = 15
        expected = 32

        assertEquals(expected, solution.rangeSumBST(root, L, R))

    }
}
