package me.lycheng.jeetcode;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }

    public static TreeNode fromList(List<Integer> integers) {
        if (integers.size() == 0) {
            return null;
        }

        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(new TreeNode(integers.get(0)));
        for (int i = 1; i < integers.size(); i++) {
            if (integers.get(i) == null) {
                nodes.add(null);
                continue;
            }
            TreeNode tn = new TreeNode(integers.get(i));
            nodes.add(tn);

            if (i % 2 == 1) {
                nodes.get((i - 1) / 2).left = tn;
            } else {
                nodes.get((i - 1) / 2).right = tn;
            }
        }
        return nodes.get(0);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
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
