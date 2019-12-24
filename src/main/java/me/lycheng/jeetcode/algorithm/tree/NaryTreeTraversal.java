package me.lycheng.jeetcode.algorithm.tree;

import me.lycheng.jeetcode.Node;

import java.util.ArrayList;
import java.util.List;

public class NaryTreeTraversal {

    /**
     * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
     *
     * @param root N-ary tree node
     * @return list of val
     */
    public List<Integer> preorder(me.lycheng.jeetcode.Node root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(root.val);
        if (root.children != null) {
            root.children.forEach(child -> {
                list.addAll(preorder(child));
            });
        }
        return list;
    }

    /**
     * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
     *
     * @param root N-ary tree node
     * @return list of val
     */
    public List<Integer> postorder(Node root) {
        if (root == null) {
            return new ArrayList<Integer>();
        }

        List<Integer> list = new ArrayList<Integer>();
        if (root.children != null) {
            root.children.forEach(child -> {
                list.addAll(postorder(child));
            });
        }
        list.add(root.val);
        return list;
    }
}
