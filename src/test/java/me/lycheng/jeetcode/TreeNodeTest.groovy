package me.lycheng.jeetcode

class TreeNodeTest extends GroovyTestCase {
    void testArrayToTreeNode() {
        def list = [1, null, 3]
        def root = TreeNode.fromList(list)

        assert root.val == 1
        assert root.left == null
        assert root.right.val == 3

        list = [1, 2, 3]
        root = TreeNode.fromList(list)

        assert root.val == 1
        assert root.left.val == 2
        assert root.right.val == 3
    }
}
