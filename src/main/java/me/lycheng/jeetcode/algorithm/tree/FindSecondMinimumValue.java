package me.lycheng.jeetcode.algorithm.tree;

import me.lycheng.jeetcode.TreeNode;

/**
 * https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
 */
public class FindSecondMinimumValue {

    public int findSecondMinimumValue(TreeNode root) {
        if (root.left == null) {
            return -1;
        }

        int left = (root.left.val == root.val) ? findSecondMinimumValue(root.left) : root.left.val;
        int right = (root.right.val == root.val) ? findSecondMinimumValue(root.right) : root.right.val;
        return (left == -1 || right == -1) ? Math.max(left, right) : Math.min(left, right);
    }
}
