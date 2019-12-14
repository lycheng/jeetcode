package me.lycheng.jeetcode.tree

import me.lycheng.jeetcode.Node;

class NaryTreeTraversalTest extends GroovyTestCase {

    NaryTreeTraversal treeTraversal = new NaryTreeTraversal()

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

    void testPreorder() {
        def root = getRoot()
        def expected = [1, 3, 5, 6, 2, 4]

        assert expected.equals(treeTraversal.preorder(root))

    }

    void testPostorder() {
        def root = getRoot()
        def expected = [5, 6, 3, 2, 4, 1]

        assert expected.equals(treeTraversal.postorder(root))
    }
}
