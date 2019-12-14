package me.lycheng.jeetcode.tree;

import me.lycheng.jeetcode.TreeNode;

/**
 * https://leetcode.com/problems/increasing-order-search-tree/
 */
public class IncreasingOrderSearchTree {
    public TreeNode increasingBST(TreeNode root) {
        return increasingBST(root, null);
    }

    public TreeNode increasingBST(TreeNode root, TreeNode rightNode) {
        if (root == null)
            return rightNode;

        TreeNode res = increasingBST(root.left, root);
        root.left = null;
        root.right = increasingBST(root.right, rightNode);
        return res;
    }
}
