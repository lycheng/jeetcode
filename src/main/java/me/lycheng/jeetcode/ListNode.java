package me.lycheng.jeetcode;


import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;

    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode arrayToListNode(List<Integer> nums) {
        if (nums.size() == 0) {
            return null;
        }

        ListNode head = new ListNode(0);
        ListNode pt = head;

        for (int i = 0; i < nums.size(); i++) {
            pt.val = nums.get(i);
            if (i == nums.size() - 1) {
                break;
            }

            pt.next = new ListNode(0);
            pt = pt.next;
        }
        return head;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof ListNode)) return false;

        ListNode node = (ListNode) obj;
        ListNode pt = this;

        while (node != null && pt != null) {
            if (node.val != pt.val) {
                return false;
            }
            node = node.next;
            pt = pt.next;
        }
        return node == null && pt == null;
    }

    @Override
    public String toString() {
        List<String> list = new ArrayList<>();
        ListNode pt = this;

        while (pt != null) {
            list.add(String.valueOf(pt.val));
            pt = pt.next;
        }
        return String.join(",", list);
    }
}