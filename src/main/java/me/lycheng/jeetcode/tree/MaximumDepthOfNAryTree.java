package me.lycheng.jeetcode.tree;

import me.lycheng.jeetcode.Node;

/**
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 */
public class MaximumDepthOfNAryTree {

    public int maxDepth(me.lycheng.jeetcode.Node root) {
        if (root == null) {
            return 0;
        }

        int depth = 1;
        if (root.children == null || root.children.size() == 0) {
            return depth;
        }

        int childMaxDepth = Integer.MIN_VALUE;
        for(Node child: root.children) {
            int md = maxDepth(child);
            if (md > childMaxDepth)
                childMaxDepth = md;
        }
        return childMaxDepth + 1;
    }
}
