package me.lycheng.jeetcode.tree

import me.lycheng.jeetcode.TreeNode

class FindModeInBinarySearchTreeTest extends GroovyTestCase {

    FindModeInBinarySearchTree fm = new FindModeInBinarySearchTree()

    void testFindMode() {
        def root = TreeNode.fromList([1, null, 2, null, null, 2])
        def expected = [2] as int[]

        assertEquals(expected, fm.findMode(root))
    }

    void testTraversalAndGetMaxCnt() {

        def root = TreeNode.fromList([1, null, 2, null, null, 2])
        def map = new HashMap<Integer, Integer>();
        def expected = 2

        assertEquals(expected, fm.traversalAndGetMaxCnt(root, map, 0))
    }
}
