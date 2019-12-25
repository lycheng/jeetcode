package me.lycheng.jeetcode.algorithm.linkedlist;

import me.lycheng.jeetcode.ListNode;

public class ConvertBinaryNumberInaLinkedListToInteger {

    public int getDecimalValue(ListNode head) {
        int rv = 0;
        while (head != null) {
            rv = rv * 2 + head.val;
            head = head.next;
        }
        return rv;
    }
}
