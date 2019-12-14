package me.lycheng.jeetcode.linkedlist

import me.lycheng.jeetcode.ListNode

class RemoveDuplicatesFromSortedListTest extends GroovyTestCase {
    void testDeleteDuplicates() {
        def o = new RemoveDuplicatesFromSortedList()

        def src = ListNode.arrayToListNode([1, 2, 3, 3, 4, 4, 5])
        def dst = ListNode.arrayToListNode([1, 2, 5])
        assert o.deleteDuplicates(src) == dst

        src = ListNode.arrayToListNode([1, 1, 1, 1, 2])
        dst = ListNode.arrayToListNode([2])
        assert o.deleteDuplicates(src) == dst

        src = ListNode.arrayToListNode([1])
        dst = ListNode.arrayToListNode([1])
        assert o.deleteDuplicates(src) == dst
    }
}
