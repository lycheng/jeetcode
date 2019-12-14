package me.lycheng.jeetcode.tree

import me.lycheng.jeetcode.TreeNode

class LeafSimilarTreesTest extends GroovyTestCase {

    LeafSimilarTrees l = new LeafSimilarTrees()

    void testLeafSimilar() {

        def node1 = TreeNode.fromList([1, 2])
        def node2 = TreeNode.fromList([1, 2])
        assert l.leafSimilar(node1, node2)

        node1 = TreeNode.fromList([1, 2, 3, 4, null, 5])
        node2 = TreeNode.fromList([1, 4, 5])
        assert l.leafSimilar(node1, node2)
    }
}
