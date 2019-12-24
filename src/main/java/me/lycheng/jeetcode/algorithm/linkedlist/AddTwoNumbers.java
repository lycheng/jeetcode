package me.lycheng.jeetcode.algorithm.linkedlist;

import me.lycheng.jeetcode.ListNode;

/*
 * https://leetcode.com/problems/add-two-numbers/description/
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode node = new ListNode(0);
        ListNode head = node;
        int carry = 0;
        while (true) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            node.val = x + y + carry;
            carry = node.val / 10;
            node.val = node.val % 10;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;

            if (l1 == null && l2 == null) {
                break;
            }

            node.next = new ListNode(0);
            node = node.next;
        }

        if (carry > 0) {
            node.next = new ListNode(carry);
        }
        return head;
    }

}
