package me.lycheng.jeetcode.tree;

import me.lycheng.jeetcode.TreeNode;

/**
 * https://leetcode.com/problems/univalued-binary-tree/
 */
public class UnivaluedBinaryTree {

    public boolean isUnivalTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        if (root.left != null && root.left.val != root.val) {
            return false;
        }

        if (root.right != null && root.right.val != root.val) {
            return false;
        }

        return isUnivalTree(root.left) && isUnivalTree(root.right);
    }
}
