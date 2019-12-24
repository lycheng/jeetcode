package me.lycheng.jeetcode.algorithm.tree

import me.lycheng.jeetcode.Node;

class MaximumDepthOfNAryTreeTest extends GroovyTestCase {

    MaximumDepthOfNAryTree md = new MaximumDepthOfNAryTree()

    Node getRoot() {
        Node root = new Node(1, new ArrayList<Node>())
        Node node3 = new Node(3, new ArrayList<Node>())
        node3.children.add(new Node(5, null))
        node3.children.add(new Node(6, null))

        root.children.add(node3)
        root.children.add(new Node(2, null))
        root.children.add(new Node(4, null))
        return root
    }


    void testMaxDepth() {
        def root = getRoot()

        assertEquals(3, md.maxDepth(root))
    }
}
