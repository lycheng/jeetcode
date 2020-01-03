package me.lycheng.jeetcode.algorithm.tree;

import me.lycheng.jeetcode.TreeNode;

/**
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 */
public class SumOfRootToLeafBinaryNumbers {
    public int sumRootToLeaf(TreeNode root) {
        return cal(root, 0);
    }

    private int cal(TreeNode root, int rv) {
        if (root == null)
            return rv;

        rv = (rv << 1) + root.val;
        if (root.left == null && root.right == null)
            return rv;

        int result = 0;
        if (root.left != null)
            result += cal(root.left, rv);
        if (root.right != null)
            result += cal(root.right, rv);
        return result;
    }
}
