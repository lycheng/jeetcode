package me.lycheng.jeetcode.algorithm.tree;

import me.lycheng.jeetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeTraversal {

    /*
     * https://leetcode.com/problems/binary-tree-inorder-traversal/
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        List<Integer> list = new ArrayList<Integer>();
        list.addAll(this.inorderTraversal(root.left));
        list.add(root.val);
        list.addAll(this.inorderTraversal(root.right));
        return list;
    }

    /*
     * https://leetcode.com/problems/binary-tree-preorder-traversal/
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(root.val);
        list.addAll(this.preorderTraversal(root.left));
        list.addAll(this.preorderTraversal(root.right));
        return list;
    }

    /*
     * https://leetcode.com/problems/binary-tree-postorder-traversal/
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        List<Integer> list = new ArrayList<Integer>();
        list.addAll(this.postorderTraversal(root.left));
        list.addAll(this.postorderTraversal(root.right));
        list.add(root.val);
        return list;
    }
}