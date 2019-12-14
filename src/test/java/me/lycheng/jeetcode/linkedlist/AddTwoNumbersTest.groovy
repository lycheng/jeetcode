package me.lycheng.jeetcode.linkedlist

import me.lycheng.jeetcode.ListNode

class AddTwoNumbersTest extends GroovyTestCase {
    void testAddTwoNumbers() {
        ListNode l1 = ListNode.arrayToListNode([2, 4, 3])
        ListNode l2 = ListNode.arrayToListNode([5, 6, 4])

        def obj = new AddTwoNumbers()
        ListNode rv = obj.addTwoNumbers(l1, l2)
        assert rv == ListNode.arrayToListNode([7, 0, 8])
    }
}
