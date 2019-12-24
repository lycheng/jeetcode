package me.lycheng.jeetcode.algorithm.linkedlist

import me.lycheng.jeetcode.ListNode

class MiddleOfTheLinkedListTest extends GroovyTestCase {

    MiddleOfTheLinkedList m = new MiddleOfTheLinkedList()

    void testMiddleNode() {
        def ln = ListNode.arrayToListNode([1, 2, 3, 4, 5])
        def expected = 3
        assertEquals(expected, m.middleNode(ln).val)

        ln = ListNode.arrayToListNode([1, 2, 3, 4, 5, 6])
        expected = 4
        assertEquals(expected, m.middleNode(ln).val)
    }
}
