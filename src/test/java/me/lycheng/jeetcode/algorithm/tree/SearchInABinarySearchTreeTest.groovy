package me.lycheng.jeetcode.algorithm.tree

import me.lycheng.jeetcode.TreeNode

class SearchInABinarySearchTreeTest extends GroovyTestCase {
    void testSearchBST() {

        SearchInABinarySearchTree s = new SearchInABinarySearchTree()
        TreeNode root = TreeNode.fromList([4, 2, 7, 1, 3])
        int val = 2

        TreeNode res = s.searchBST(root, 2)

        assertEquals(res.val, val)
        assertEquals(res.left.val, 1)
        assertEquals(res.right.val, 3)
    }
}
