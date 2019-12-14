package me.lycheng.jeetcode.tree;


import me.lycheng.jeetcode.TreeNode;

/**
 * https://leetcode.com/problems/range-sum-of-bst/
 */
public class RangeSumOfBST {

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) {
            return 0;
        }

        if (root.val <= L) {
            return (L == root.val? L: 0) + rangeSumBST(root.right, L, R);
        }

        if (root.val >= R) {
            return (R == root.val? R: 0) + rangeSumBST(root.left, L, R);
        }

        return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
    }
}