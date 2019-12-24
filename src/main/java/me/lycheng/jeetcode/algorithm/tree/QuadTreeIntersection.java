package me.lycheng.jeetcode.algorithm.tree;

class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
}

/**
 * https://leetcode.com/problems/quad-tree-intersection/
 */
public class QuadTreeIntersection {
    public Node intersect(Node quadTree1, Node quadTree2) {
        if (quadTree1.isLeaf)
            return quadTree1.val? quadTree1: quadTree2;
        if (quadTree2.isLeaf)
            return quadTree2.val? quadTree2: quadTree1;

        Node res = new Node();
        res.val = false;

        res.topLeft = intersect(quadTree1.topLeft, quadTree2.topLeft);
        res.topRight = intersect(quadTree1.topRight, quadTree2.topRight);
        res.bottomLeft = intersect(quadTree1.bottomLeft, quadTree2.bottomLeft);
        res.bottomRight = intersect(quadTree1.bottomRight, quadTree2.bottomRight);

        if (res.topLeft.isLeaf && res.topRight.isLeaf
                && res.bottomLeft.isLeaf && res.bottomRight.isLeaf
                && res.topLeft.val == res.topRight.val
                && res.topRight.val == res.bottomLeft.val
                && res.bottomLeft.val == res.bottomRight.val) {
            res.isLeaf = true;
            res.val = res.topLeft.val;
        }
        return res;
    }
}
