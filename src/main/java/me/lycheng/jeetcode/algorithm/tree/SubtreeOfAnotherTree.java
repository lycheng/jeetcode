package me.lycheng.jeetcode.algorithm.tree;

import me.lycheng.jeetcode.TreeNode;

/**
 * https://leetcode.com/problems/subtree-of-another-tree/
 */
public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if ((s == null && t == null) || t == null) {
            return true;
        }

        if (s == null) {
            return false;
        }

        if (isSameTree(s, t)) {
            return true;
        }

        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }

    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            }

            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }
}
