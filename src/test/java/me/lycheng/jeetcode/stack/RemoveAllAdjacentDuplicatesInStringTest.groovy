package me.lycheng.jeetcode.stack

class RemoveAllAdjacentDuplicatesInStringTest extends GroovyTestCase {

    def solution = new RemoveAllAdjacentDuplicatesInString()

    void testRemoveDuplicates() {

        def input = "abbaca"
        def expected = "ca"
        assertEquals(expected, solution.removeDuplicates(input))
    }
}
