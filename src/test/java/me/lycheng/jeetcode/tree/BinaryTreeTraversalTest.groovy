package me.lycheng.jeetcode.tree

import me.lycheng.jeetcode.TreeNode

class BinaryTreeTraversalTest extends GroovyTestCase {
    void testInorderTraversal() {
        def root = TreeNode.fromList([1, 2, 3])

        BinaryTreeTraversal btt = new BinaryTreeTraversal()
        assert btt.inorderTraversal(root) == [2, 1, 3]
    }

    void testPreorderTraversal() {
        def root = TreeNode.fromList([1, 2, 3])

        BinaryTreeTraversal btt = new BinaryTreeTraversal()
        assert btt.preorderTraversal(root) == [1, 2, 3]
    }

    void testPostorderTraversal() {
        def root = TreeNode.fromList([1, 2, 3])

        BinaryTreeTraversal btt = new BinaryTreeTraversal()
        assert btt.postorderTraversal(root) == [2, 3, 1]
    }
}
