package me.lycheng.jeetcode.algorithm.tree

import me.lycheng.jeetcode.TreeNode

class SameTreeTest extends GroovyTestCase {
    void testIsSameTree() {
        SameTree solution = new SameTree();

        def p = TreeNode.fromList([1, 2, 3])
        def q = TreeNode.fromList([1, 2, 3])

        assert solution.isSameTree(p, q)
    }
}
