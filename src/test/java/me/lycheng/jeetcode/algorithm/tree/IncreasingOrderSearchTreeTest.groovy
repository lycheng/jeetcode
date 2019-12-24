package me.lycheng.jeetcode.algorithm.tree

import me.lycheng.jeetcode.TreeNode

class IncreasingOrderSearchTreeTest extends GroovyTestCase {

    IncreasingOrderSearchTree iost = new IncreasingOrderSearchTree()

    void testIncreasingBST() {

        def root = TreeNode.fromList([5, 3, 6, 2, 4, null, 8, 1, null, null, null, null, null, 7, 9])
        def res = iost.increasingBST(root)
        def lastVal = res.val

        while (res.right != null) {
            assert res.right.val > lastVal
            lastVal = res.right.val;
            res = res.right.right;
        }
    }
}
