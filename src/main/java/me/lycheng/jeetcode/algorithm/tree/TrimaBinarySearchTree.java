package me.lycheng.jeetcode.algorithm.tree;

import me.lycheng.jeetcode.TreeNode;

public class TrimaBinarySearchTree {

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null)
            return null;

        if (root.val > R) {
            root.right = null;
            return trimBST(root.left, L, R);
        }
        if (root.val < L) {
            root.left = null;
            return trimBST(root.right, L, R);
        }

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }
}
