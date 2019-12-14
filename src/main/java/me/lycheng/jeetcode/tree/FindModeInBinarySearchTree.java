package me.lycheng.jeetcode.tree;

import me.lycheng.jeetcode.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-mode-in-binary-search-tree/
 */
public class FindModeInBinarySearchTree {

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[] {};
        }

        Map<Integer,  Integer> map = new HashMap<>();
        int maxCnt = traversalAndGetMaxCnt(root, map, 0);

        List<Integer> res = new LinkedList<>();
        map.forEach((k, v) -> {
            if (v == maxCnt)
                res.add(k);
        });
        return res.stream().mapToInt(i -> i).toArray();
    }

    public int traversalAndGetMaxCnt(TreeNode root, Map<Integer, Integer> map, int cnt) {
        if (root == null) {
            return cnt;
        }

        int curCnt = map.getOrDefault(root.val, 0) + 1;
        map.put(root.val, curCnt);

        if (curCnt > cnt)
            cnt = curCnt;

        int leftCnt = this.traversalAndGetMaxCnt(root.left, map, cnt);
        int rightCnt = this.traversalAndGetMaxCnt(root.right, map, cnt);

        if (leftCnt > cnt)
            cnt = leftCnt;
        if (rightCnt > cnt)
            cnt = rightCnt;
        return cnt;
    }
}
