package me.lycheng.jeetcode.algorithm.linkedlist;

import me.lycheng.jeetcode.ListNode;

/**
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        ListNode first = head;
        ListNode second = head;

        while (first.next != null) {
            second = second.next;
            first = first.next;
            if (first.next == null) {
                break;
            }
            first = first.next;
        }
        return second;
    }
}
