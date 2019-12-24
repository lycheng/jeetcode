package me.lycheng.jeetcode.algorithm.tree

import me.lycheng.jeetcode.TreeNode

class SubtreeOfAnotherTreeTest extends GroovyTestCase {
    void testIsSubtree() {
        SubtreeOfAnotherTree solution = new SubtreeOfAnotherTree();

        def s = TreeNode.fromList([1, 2, 3])
        def t = TreeNode.fromList([1, 2, 3])
        assertEquals(solution.isSubtree(s, t), true)

        s = TreeNode.fromList([3, 4, 5, 1, 2])
        t = TreeNode.fromList([4, 1, 2])
        assertEquals(solution.isSubtree(s, t), true)

        s = TreeNode.fromList([3, 4, 5, 1, 2, null, null, null, null, 0])
        t = TreeNode.fromList([4, 1, 2])
        assertEquals(solution.isSubtree(s, t), false)
    }
}
