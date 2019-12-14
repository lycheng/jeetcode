package me.lycheng.jeetcode.tree;

import me.lycheng.jeetcode.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/leaf-similar-trees/
 */
public class LeafSimilarTrees {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        return getLeaves(root1).equals(getLeaves(root2));
    }

    private List<Integer> getLeaves(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) {
            return res;
        }

        if (root.left == null && root.right == null) {
            res.add(root.val);
            return res;
        }

        res.addAll(getLeaves(root.left));
        res.addAll(getLeaves(root.right));
        return res;
    }
}
