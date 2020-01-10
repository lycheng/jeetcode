package me.lycheng.jeetcode.algorithm.tree

import me.lycheng.jeetcode.TreeNode

class TrimaBinarySearchTreeTest extends GroovyTestCase {
    void testTrimBST() {
        def solution = new TrimaBinarySearchTree()
        def root = TreeNode.fromList([1, 0, 2])
        def L = 1
        def R = 2
        def rv = solution.trimBST(root, L, R)
        assert rv.left == null
        assert rv.right.val == 2
    }
}
