package me.lycheng.jeetcode.algorithm.tree

import me.lycheng.jeetcode.TreeNode

class FindSecondMinimumValueTest extends GroovyTestCase {
    void testFindSecondMinimumValue() {
        FindSecondMinimumValue fsmv = new FindSecondMinimumValue()

        def root = TreeNode.fromList([1, 2, 3])
        assert fsmv.findSecondMinimumValue(root) == 2

        root = TreeNode.fromList([2, 2, 2])
        assert fsmv.findSecondMinimumValue(root) == -1
    }
}
