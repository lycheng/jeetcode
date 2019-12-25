package me.lycheng.jeetcode.algorithm.linkedlist

import me.lycheng.jeetcode.ListNode

class ConvertBinaryNumberInaLinkedListToIntegerTest extends GroovyTestCase {
    void testGetDecimalValue() {
        def solution = new ConvertBinaryNumberInaLinkedListToInteger()

        def cases = [
                0    : ListNode.arrayToListNode([0]),
                1    : ListNode.arrayToListNode([1]),
                18880: ListNode.arrayToListNode([1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0])
        ]

        cases.each {expected, input ->
            assertEquals(expected, solution.getDecimalValue(input))
        }
    }
}
