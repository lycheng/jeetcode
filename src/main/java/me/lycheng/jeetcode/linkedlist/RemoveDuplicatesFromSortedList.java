package me.lycheng.jeetcode.linkedlist;

import me.lycheng.jeetcode.ListNode;

/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode n = dummy;

        while (n.next != null && n.next.next != null) {
            if (n.next.val == n.next.next.val) {
                int val = n.next.val;
                while (n.next != null && n.next.val == val) {
                    n.next = n.next.next;
                }
            } else {
                n = n.next;
            }
        }
        return dummy.next;
    }
}
