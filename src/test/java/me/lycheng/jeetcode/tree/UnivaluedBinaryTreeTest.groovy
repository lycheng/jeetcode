package me.lycheng.jeetcode.tree

import me.lycheng.jeetcode.TreeNode

class UnivaluedBinaryTreeTest extends GroovyTestCase {
    void testIsUnivalTree() {

        UnivaluedBinaryTree solution = new UnivaluedBinaryTree()

        TreeNode root = TreeNode.fromList([1, 1, 1, 1, 1, null, 1])
        boolean expected = true
        assertEquals(expected, solution.isUnivalTree(root))

        root = TreeNode.fromList([2, 2, 2, 5, 2])
        expected = false
        assertEquals(expected, solution.isUnivalTree(root))
    }
}
