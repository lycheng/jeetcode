package me.lycheng.jeetcode.linkedlist

import me.lycheng.jeetcode.ListNode

class MergeTwoSortedListsTest extends GroovyTestCase {
    void testMergeTwoLists() {
        def l1 = ListNode.arrayToListNode([1, 2, 4, 5])
        def l2 = ListNode.arrayToListNode([3])
        def l3 = ListNode.arrayToListNode([1, 2, 3, 4, 5])
        MergeTwoSortedLists m = new MergeTwoSortedLists()

        assert m.mergeTwoLists(l1, l2) == l3
        assert m.mergeTwoLists(l1, null) == l1
    }
}
